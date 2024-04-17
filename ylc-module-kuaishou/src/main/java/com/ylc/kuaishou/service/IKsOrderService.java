package com.ylc.kuaishou.service;

import com.ylc.kuaishou.domain.KsOrder;

import java.util.List;

/**
 * 快手平台订单Service接口
 * 
 * @author xiong
 * @date 2023-07-03
 */
public interface IKsOrderService 
{
    /**
     * 查询快手平台订单
     * 
     * @param orderId 快手平台订单主键
     * @return 快手平台订单
     */
    public KsOrder selectKsOrderByOrderId(Long orderId);

    /**
     * 查询快手平台订单列表
     * 
     * @param ksOrder 快手平台订单
     * @return 快手平台订单集合
     */
    public List<KsOrder> selectKsOrderList(KsOrder ksOrder);

    /**
     * 新增快手平台订单
     * 
     * @param ksOrder 快手平台订单
     * @return 结果
     */
    public int insertKsOrder(KsOrder ksOrder);

    /**
     * 修改快手平台订单
     * 
     * @param ksOrder 快手平台订单
     * @return 结果
     */
    public int updateKsOrder(KsOrder ksOrder);

    /**
     * 批量删除快手平台订单
     * 
     * @param orderIds 需要删除的快手平台订单主键集合
     * @return 结果
     */
    public int deleteKsOrderByOrderIds(Long[] orderIds);

    /**
     * 删除快手平台订单信息
     * 
     * @param orderId 快手平台订单主键
     * @return 结果
     */
    public int deleteKsOrderByOrderId(Long orderId);
}
