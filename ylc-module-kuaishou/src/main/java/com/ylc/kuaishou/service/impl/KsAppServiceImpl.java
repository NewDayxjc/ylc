package com.ylc.kuaishou.service.impl;

import java.util.List;

import com.code.ylc.framework.common.util.DateUtils;
import com.ylc.kuaishou.domain.KsApp;
import com.ylc.kuaishou.mapper.KsAppMapper;
import com.ylc.kuaishou.service.IKsAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * APP配置信息Service业务层处理
 * 
 * @author xiong
 * @date 2023-06-29
 */
@Service
public class KsAppServiceImpl implements IKsAppService
{
    @Autowired
    private KsAppMapper ksAppMapper;

    /**
     * 查询APP配置信息
     * 
     * @param id APP配置信息主键
     * @return APP配置信息
     */
    @Override
    public KsApp selectKsAppById(Long id)
    {
        return ksAppMapper.selectKsAppById(id);
    }

    /**
     * 查询APP配置信息列表
     * 
     * @param ksApp APP配置信息
     * @return APP配置信息
     */
    @Override
    public List<KsApp> selectKsAppList(KsApp ksApp)
    {
        return ksAppMapper.selectKsAppList(ksApp);
    }

    /**
     * 新增APP配置信息
     * 
     * @param ksApp APP配置信息
     * @return 结果
     */
    @Override
    public int insertKsApp(KsApp ksApp)
    {
        ksApp.setCreateTime(DateUtils.getNowDate());
        return ksAppMapper.insertKsApp(ksApp);
    }

    /**
     * 修改APP配置信息
     * 
     * @param ksApp APP配置信息
     * @return 结果
     */
    @Override
    public int updateKsApp(KsApp ksApp)
    {
        ksApp.setUpdateTime(DateUtils.getNowDate());
        return ksAppMapper.updateKsApp(ksApp);
    }

    /**
     * 批量删除APP配置信息
     * 
     * @param ids 需要删除的APP配置信息主键
     * @return 结果
     */
    @Override
    public int deleteKsAppByIds(Long[] ids)
    {
        return ksAppMapper.deleteKsAppByIds(ids);
    }

    /**
     * 删除APP配置信息信息
     * 
     * @param id APP配置信息主键
     * @return 结果
     */
    @Override
    public int deleteKsAppById(Long id)
    {
        return ksAppMapper.deleteKsAppById(id);
    }
}
