package com.ylc.kuaishou.mapper;

import com.ylc.kuaishou.domain.KsShop;
import org.springframework.data.repository.query.Param;

import java.util.List;


/**
 * 快手店铺配置信息Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-29
 */
public interface KsShopMapper 
{
    /**
     * 查询快手店铺配置信息
     * 
     * @param id 快手店铺配置信息主键
     * @return 快手店铺配置信息
     */
    public KsShop selectKsShopById(Long id);

    /**
     * 查询快手店铺配置信息
     *
     * @param id 快手店铺配置信息主键
     * @return 快手店铺配置信息
     */
    public KsShop selectKsShopByKey(String ksAppKey);

    public KsShop selectKsShopByOpenIdAndKey(@Param("openId") String openId, @Param("ksAppKey") String ksAppKey);

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
     * 删除快手店铺配置信息
     * 
     * @param id 快手店铺配置信息主键
     * @return 结果
     */
    public int deleteKsShopById(Long id);

    /**
     * 批量删除快手店铺配置信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteKsShopByIds(Long[] ids);
}
