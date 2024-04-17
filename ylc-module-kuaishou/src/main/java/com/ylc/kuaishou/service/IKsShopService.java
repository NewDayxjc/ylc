package com.ylc.kuaishou.service;

import com.ylc.kuaishou.domain.KsShop;

import java.util.List;

/**
 * 快手店铺配置信息Service接口
 * 
 * @author ruoyi
 * @date 2023-06-29
 */
public interface IKsShopService 
{
    /**
     * 查询快手店铺配置信息
     * 
     * @param id 快手店铺配置信息主键
     * @return 快手店铺配置信息
     */
    public KsShop selectKsShopById(Long id);

    /**
     * 查询快手店铺配置信息列表
     * 
     * @param ksShop 快手店铺配置信息
     * @return 快手店铺配置信息集合
     */
    public List<KsShop> selectKsShopList(KsShop ksShop);

    /**
     * 新增快手店铺配置信息
     * 
     * @param ksShop 快手店铺配置信息
     * @return 结果
     */
    public int insertKsShop(KsShop ksShop);

    /**
     * 修改快手店铺配置信息
     * 
     * @param ksShop 快手店铺配置信息
     * @return 结果
     */
    public int updateKsShop(KsShop ksShop);

    /**
     * 批量删除快手店铺配置信息
     * 
     * @param ids 需要删除的快手店铺配置信息主键集合
     * @return 结果
     */
    public int deleteKsShopByIds(Long[] ids);

    /**
     * 删除快手店铺配置信息信息
     * 
     * @param id 快手店铺配置信息主键
     * @return 结果
     */
    public int deleteKsShopById(Long id);
}
