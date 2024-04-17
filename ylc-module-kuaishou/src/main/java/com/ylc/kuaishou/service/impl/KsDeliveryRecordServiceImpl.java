package com.ylc.kuaishou.service.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;


import com.code.ylc.framework.common.util.DateUtils;
import com.ylc.kuaishou.domain.KsDeliveryData;
import com.ylc.kuaishou.domain.KsDeliveryRecord;
import com.ylc.kuaishou.domain.KsOrder;
import com.ylc.kuaishou.mapper.KsDeliveryDataMapper;
import com.ylc.kuaishou.mapper.KsDeliveryRecordMapper;
import com.ylc.kuaishou.mapper.KsOrderMapper;
import com.ylc.kuaishou.service.IKsDeliveryRecordService;
import com.ylc.kuaishou.vo.DeliveryRecordExcelVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * 快递记录管理Service业务层处理
 * 
 * @author xiong
 * @date 2023-06-30
 */
@Service
public class KsDeliveryRecordServiceImpl implements IKsDeliveryRecordService
{
    @Autowired
    private KsDeliveryRecordMapper ksDeliveryRecordMapper;

    @Resource
    private KsOrderMapper ksOrderMapper;

    @Resource
    private KsDeliveryDataMapper ksDeliveryDataMapper;

    /**
     * 查询快递记录管理
     * 
     * @param id 快递记录管理主键
     * @return 快递记录管理
     */
    @Override
    public KsDeliveryRecord selectKsDeliveryRecordById(Long id)
    {
        return ksDeliveryRecordMapper.selectKsDeliveryRecordById(id);
    }

    /**
     * 查询快递记录管理列表
     * 
     * @param ksDeliveryRecord 快递记录管理
     * @return 快递记录管理
     */
    @Override
    public List<KsDeliveryRecord> selectKsDeliveryRecordList(KsDeliveryRecord ksDeliveryRecord)
    {
        return ksDeliveryRecordMapper.selectKsDeliveryRecordList(ksDeliveryRecord);
    }

    /**
     * 新增快递记录管理
     * 
     * @param ksDeliveryRecord 快递记录管理
     * @return 结果
     */
    @Override
    public int insertKsDeliveryRecord(KsDeliveryRecord ksDeliveryRecord)
    {
        ksDeliveryRecord.setCreateTime(DateUtils.getNowDate());
        return ksDeliveryRecordMapper.insertKsDeliveryRecord(ksDeliveryRecord);
    }

    /**
     * 修改快递记录管理
     * 
     * @param ksDeliveryRecord 快递记录管理
     * @return 结果
     */
    @Override
    public int updateKsDeliveryRecord(KsDeliveryRecord ksDeliveryRecord)
    {
        ksDeliveryRecord.setUpdateTime(DateUtils.getNowDate());
        return ksDeliveryRecordMapper.updateKsDeliveryRecord(ksDeliveryRecord);
    }

    /**
     * 批量删除快递记录管理
     * 
     * @param ids 需要删除的快递记录管理主键
     * @return 结果
     */
    @Override
    public int deleteKsDeliveryRecordByIds(Long[] ids)
    {
        return ksDeliveryRecordMapper.deleteKsDeliveryRecordByIds(ids);
    }

    /**
     * 删除快递记录管理信息
     * 
     * @param id 快递记录管理主键
     * @return 结果
     */
    @Override
    public int deleteKsDeliveryRecordById(Long id)
    {
        return ksDeliveryRecordMapper.deleteKsDeliveryRecordById(id);
    }

    @Override
    public void operateDeliveryData(DeliveryRecordExcelVo deliveryRecordExcelVo) {

        //业务处理
        HashSet<KsDeliveryData> ksDeliveryDataHashSet = deliveryRecordExcelVo.getKsDeliveryDataHashSet();
        AtomicInteger successNumber = deliveryRecordExcelVo.getSuccessNumber();
        AtomicInteger failNumber = deliveryRecordExcelVo.getFailNumber();


        KsDeliveryRecord ksDeliveryRecord = new KsDeliveryRecord();

        ksDeliveryRecord.setTotal(ksDeliveryDataHashSet.size());

        //关联订单处理

        for (KsDeliveryData ksDeliveryData : ksDeliveryDataHashSet) {

            KsOrder ksOrder = ksOrderMapper.selectKsOrderByOrderId(Long.parseLong(ksDeliveryData.getNativeNumber()));

            if(Objects.nonNull(ksOrder)){

                ksOrder.setKsDeliveryName(ksDeliveryData.getDeliveryName());
                ksOrder.setKsDeliveryNumber(ksDeliveryData.getDeliveryNumber());
                //序列号
                ksOrder.setIccid(ksDeliveryData.getSerialNumber());
                //店铺
                ksOrder.setKsShopName(ksDeliveryData.getShopName());
                //发货时间
//                Date deliveryTime =
                ksOrder.setOrderSendTime(ksDeliveryData.getDeliveryTime());
                //签收时间
                ksOrder.setSignTime(ksDeliveryData.getSignTime());

                ksOrder.setSignStatus(ksDeliveryData.getSignStatus());


//                ksDeliveryData.getDeliveryTime()
                Integer result = ksOrderMapper.updateKsOrder(ksOrder);
                if(result.equals(1)){
                    ksDeliveryData.setStatus("1");
                    successNumber.addAndGet(1);

                }
            }else{

                ksDeliveryData.setStatus("0");
                failNumber.addAndGet(1);
                ksDeliveryData.setDeliveryDescribe("订单号尚未同步");

            }

        }

        ksDeliveryRecord.setTotalFail(failNumber.intValue());
        ksDeliveryRecord.setTotalSuccess(successNumber.intValue());
        ksDeliveryRecord.setStatus("1");

        ksDeliveryRecordMapper.insertKsDeliveryRecord(ksDeliveryRecord);
        for (KsDeliveryData ksDeliveryData : ksDeliveryDataHashSet) {

            ksDeliveryData.setDeliveryRecordId(ksDeliveryRecord.getId());
            ksDeliveryDataMapper.insertKsDeliveryData(ksDeliveryData);

        }


    }
}
