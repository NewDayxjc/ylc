package com.ylc.kuaishou.mapper;

import com.ylc.kuaishou.domain.KsDeliveryData;

import java.util.List;

/**
 * 快递物流数据Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-30
 */
public interface KsDeliveryDataMapper 
{
    /**
     * 查询快递物流数据
     * 
     * @param id 快递物流数据主键
     * @return 快递物流数据
     */
    public KsDeliveryData selectKsDeliveryDataById(Long id);

    /**
     * 查询快递物流数据列表
     * 
     * @param ksDeliveryData 快递物流数据
     * @return 快递物流数据集合
     */
    public List<KsDeliveryData> selectKsDeliveryDataList(KsDeliveryData ksDeliveryData);

    /**
     * 新增快递物流数据
     * 
     * @param ksDeliveryData 快递物流数据
     * @return 结果
     */
    public int insertKsDeliveryData(KsDeliveryData ksDeliveryData);

    /**
     * 修改快递物流数据
     * 
     * @param ksDeliveryData 快递物流数据
     * @return 结果
     */
    public int updateKsDeliveryData(KsDeliveryData ksDeliveryData);

    /**
     * 删除快递物流数据
     * 
     * @param id 快递物流数据主键
     * @return 结果
     */
    public int deleteKsDeliveryDataById(Long id);

    /**
     * 批量删除快递物流数据
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteKsDeliveryDataByIds(Long[] ids);
}
