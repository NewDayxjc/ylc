package com.ylc.kuaishou.service.impl;

import java.util.List;

import com.code.ylc.framework.common.util.DateUtils;
import com.ylc.kuaishou.domain.KsOrder;
import com.ylc.kuaishou.mapper.KsOrderMapper;
import com.ylc.kuaishou.service.IKsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 快手平台订单Service业务层处理
 * 
 * @author xiong
 * @date 2023-07-03
 */
@Service
public class KsOrderServiceImpl implements IKsOrderService
{
    @Autowired
    private KsOrderMapper ksOrderMapper;

    /**
     * 查询快手平台订单
     * 
     * @param orderId 快手平台订单主键
     * @return 快手平台订单
     */
    @Override
    public KsOrder selectKsOrderByOrderId(Long orderId)
    {
        return ksOrderMapper.selectKsOrderByOrderId(orderId);
    }

    /**
     * 查询快手平台订单列表
     * 
     * @param ksOrder 快手平台订单
     * @return 快手平台订单
     */
    @Override
    public List<KsOrder> selectKsOrderList(KsOrder ksOrder)
    {
        return ksOrderMapper.selectKsOrderList(ksOrder);
    }

    /**
     * 新增快手平台订单
     * 
     * @param ksOrder 快手平台订单
     * @return 结果
     */
    @Override
    public int insertKsOrder(KsOrder ksOrder)
    {
        ksOrder.setCreateTime(DateUtils.getNowDate());
        return ksOrderMapper.insertKsOrder(ksOrder);
    }

    /**
     * 修改快手平台订单
     * 
     * @param ksOrder 快手平台订单
     * @return 结果
     */
    @Override
    public int updateKsOrder(KsOrder ksOrder)
    {
        ksOrder.setUpdateTime(DateUtils.getNowDate());
        return ksOrderMapper.updateKsOrder(ksOrder);
    }

    /**
     * 批量删除快手平台订单
     * 
     * @param orderIds 需要删除的快手平台订单主键
     * @return 结果
     */
    @Override
    public int deleteKsOrderByOrderIds(Long[] orderIds)
    {
        return ksOrderMapper.deleteKsOrderByOrderIds(orderIds);
    }

    /**
     * 删除快手平台订单信息
     * 
     * @param orderId 快手平台订单主键
     * @return 结果
     */
    @Override
    public int deleteKsOrderByOrderId(Long orderId)
    {
        return ksOrderMapper.deleteKsOrderByOrderId(orderId);
    }
}
