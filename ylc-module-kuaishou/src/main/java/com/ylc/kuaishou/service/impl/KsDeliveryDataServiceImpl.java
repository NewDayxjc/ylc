package com.ylc.kuaishou.service.impl;

import java.util.List;

import com.code.ylc.framework.common.util.DateUtils;
import com.ylc.kuaishou.domain.KsDeliveryData;
import com.ylc.kuaishou.mapper.KsDeliveryDataMapper;
import com.ylc.kuaishou.service.IKsDeliveryDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 快递物流数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-30
 */
@Service
public class KsDeliveryDataServiceImpl implements IKsDeliveryDataService
{
    @Autowired
    private KsDeliveryDataMapper ksDeliveryDataMapper;

    /**
     * 查询快递物流数据
     * 
     * @param id 快递物流数据主键
     * @return 快递物流数据
     */
    @Override
    public KsDeliveryData selectKsDeliveryDataById(Long id)
    {
        return ksDeliveryDataMapper.selectKsDeliveryDataById(id);
    }

    /**
     * 查询快递物流数据列表
     * 
     * @param ksDeliveryData 快递物流数据
     * @return 快递物流数据
     */
    @Override
    public List<KsDeliveryData> selectKsDeliveryDataList(KsDeliveryData ksDeliveryData)
    {
        return ksDeliveryDataMapper.selectKsDeliveryDataList(ksDeliveryData);
    }

    /**
     * 新增快递物流数据
     * 
     * @param ksDeliveryData 快递物流数据
     * @return 结果
     */
    @Override
    public int insertKsDeliveryData(KsDeliveryData ksDeliveryData)
    {
        ksDeliveryData.setCreateTime(DateUtils.getNowDate());
        return ksDeliveryDataMapper.insertKsDeliveryData(ksDeliveryData);
    }

    /**
     * 修改快递物流数据
     * 
     * @param ksDeliveryData 快递物流数据
     * @return 结果
     */
    @Override
    public int updateKsDeliveryData(KsDeliveryData ksDeliveryData)
    {
        ksDeliveryData.setUpdateTime(DateUtils.getNowDate());
        return ksDeliveryDataMapper.updateKsDeliveryData(ksDeliveryData);
    }

    /**
     * 批量删除快递物流数据
     * 
     * @param ids 需要删除的快递物流数据主键
     * @return 结果
     */
    @Override
    public int deleteKsDeliveryDataByIds(Long[] ids)
    {
        return ksDeliveryDataMapper.deleteKsDeliveryDataByIds(ids);
    }

    /**
     * 删除快递物流数据信息
     * 
     * @param id 快递物流数据主键
     * @return 结果
     */
    @Override
    public int deleteKsDeliveryDataById(Long id)
    {
        return ksDeliveryDataMapper.deleteKsDeliveryDataById(id);
    }
}
