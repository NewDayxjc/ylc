package com.ylc.kuaishou.service;

import com.ylc.kuaishou.domain.KsApp;

import java.util.List;

/**
 * APP配置信息Service接口
 * 
 * @author xiong
 * @date 2023-06-29
 */
public interface IKsAppService 
{
    /**
     * 查询APP配置信息
     * 
     * @param id APP配置信息主键
     * @return APP配置信息
     */
    public KsApp selectKsAppById(Long id);

    /**
     * 查询APP配置信息列表
     * 
     * @param ksApp APP配置信息
     * @return APP配置信息集合
     */
    public List<KsApp> selectKsAppList(KsApp ksApp);

    /**
     * 新增APP配置信息
     * 
     * @param ksApp APP配置信息
     * @return 结果
     */
    public int insertKsApp(KsApp ksApp);

    /**
     * 修改APP配置信息
     * 
     * @param ksApp APP配置信息
     * @return 结果
     */
    public int updateKsApp(KsApp ksApp);

    /**
     * 批量删除APP配置信息
     * 
     * @param ids 需要删除的APP配置信息主键集合
     * @return 结果
     */
    public int deleteKsAppByIds(Long[] ids);

    /**
     * 删除APP配置信息信息
     * 
     * @param id APP配置信息主键
     * @return 结果
     */
    public int deleteKsAppById(Long id);
}
