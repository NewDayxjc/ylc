package com.ylc.kuaishou.mapper;

import com.ylc.kuaishou.domain.KsDeliveryRecord;

import java.util.List;

/**
 * 快递记录管理Mapper接口
 * 
 * @author xiong
 * @date 2023-06-30
 */
public interface KsDeliveryRecordMapper 
{
    /**
     * 查询快递记录管理
     * 
     * @param id 快递记录管理主键
     * @return 快递记录管理
     */
    public KsDeliveryRecord selectKsDeliveryRecordById(Long id);

    /**
     * 查询快递记录管理列表
     * 
     * @param ksDeliveryRecord 快递记录管理
     * @return 快递记录管理集合
     */
    public List<KsDeliveryRecord> selectKsDeliveryRecordList(KsDeliveryRecord ksDeliveryRecord);

    /**
     * 新增快递记录管理
     * 
     * @param ksDeliveryRecord 快递记录管理
     * @return 结果
     */
    public int insertKsDeliveryRecord(KsDeliveryRecord ksDeliveryRecord);

    /**
     * 修改快递记录管理
     * 
     * @param ksDeliveryRecord 快递记录管理
     * @return 结果
     */
    public int updateKsDeliveryRecord(KsDeliveryRecord ksDeliveryRecord);

    /**
     * 删除快递记录管理
     * 
     * @param id 快递记录管理主键
     * @return 结果
     */
    public int deleteKsDeliveryRecordById(Long id);

    /**
     * 批量删除快递记录管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteKsDeliveryRecordByIds(Long[] ids);
}
