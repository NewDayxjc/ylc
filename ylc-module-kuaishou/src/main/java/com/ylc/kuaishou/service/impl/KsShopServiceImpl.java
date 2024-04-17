package com.ylc.kuaishou.service.impl;

import java.util.List;

import com.code.ylc.framework.common.util.DateUtils;
import com.ylc.kuaishou.domain.KsShop;
import com.ylc.kuaishou.mapper.KsShopMapper;
import com.ylc.kuaishou.service.IKsShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 快手店铺配置信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-29
 */
@Service
public class KsShopServiceImpl implements IKsShopService
{
    @Autowired
    private KsShopMapper ksShopMapper;

    /**
     * 查询快手店铺配置信息
     * 
     * @param id 快手店铺配置信息主键
     * @return 快手店铺配置信息
     */
    @Override
    public KsShop selectKsShopById(Long id)
    {
        return ksShopMapper.selectKsShopById(id);
    }

    /**
     * 查询快手店铺配置信息列表
     * 
     * @param ksShop 快手店铺配置信息
     * @return 快手店铺配置信息
     */
    @Override
    public List<KsShop> selectKsShopList(KsShop ksShop)
    {
        return ksShopMapper.selectKsShopList(ksShop);
    }

    /**
     * 新增快手店铺配置信息
     * 
     * @param ksShop 快手店铺配置信息
     * @return 结果
     */
    @Override
    public int insertKsShop(KsShop ksShop)
    {
        ksShop.setCreateTime(DateUtils.getNowDate());
        return ksShopMapper.insertKsShop(ksShop);
    }

    /**
     * 修改快手店铺配置信息
     * 
     * @param ksShop 快手店铺配置信息
     * @return 结果
     */
    @Override
    public int updateKsShop(KsShop ksShop)
    {
        ksShop.setUpdateTime(DateUtils.getNowDate());
        return ksShopMapper.updateKsShop(ksShop);
    }

    /**
     * 批量删除快手店铺配置信息
     * 
     * @param ids 需要删除的快手店铺配置信息主键
     * @return 结果
     */
    @Override
    public int deleteKsShopByIds(Long[] ids)
    {
        return ksShopMapper.deleteKsShopByIds(ids);
    }

    /**
     * 删除快手店铺配置信息信息
     * 
     * @param id 快手店铺配置信息主键
     * @return 结果
     */
    @Override
    public int deleteKsShopById(Long id)
    {
        return ksShopMapper.deleteKsShopById(id);
    }
}
