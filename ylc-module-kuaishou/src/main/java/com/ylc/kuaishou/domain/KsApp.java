package com.ylc.kuaishou.domain;

import com.code.ylc.framework.common.pojo.BaseEntity;
import com.ylc.kuaishou.annotation.Excel;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import org.springframework.data.annotation.Transient;

import java.util.List;

/**
 * APP配置信息对象 ks_app
 * 
 * @author xiong
 * @date 2023-06-29
 */
@Getter
@Setter
public class KsApp extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** app ID */
    @Excel(name = "app ID")
    private String ksAppKey;

    /** app secret */
    @Excel(name = "app secret")
    private String ksAppSecret;

    /** app secret */
    @Excel(name = "app secret")
    private String ksSignSecret;

    /** 消息秘钥 */
    @Excel(name = "消息秘钥")
    private String ksMessageSecret;

    /** 订单列表信息同步时间 */
    @Excel(name = "订单列表信息同步时间")
    private Integer ksOrderSynchronize;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 应用名 */
    @Excel(name = "应用名")
    private String ksAppName;

    @Transient
    private List<KsShop> ksShopList;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setKsAppKey(String ksAppKey) 
    {
        this.ksAppKey = ksAppKey;
    }

    public String getKsAppKey() 
    {
        return ksAppKey;
    }
    public void setKsAppSecret(String ksAppSecret) 
    {
        this.ksAppSecret = ksAppSecret;
    }

    public String getKsAppSecret() 
    {
        return ksAppSecret;
    }
    public void setKsSignSecret(String ksSignSecret) 
    {
        this.ksSignSecret = ksSignSecret;
    }

    public String getKsSignSecret() 
    {
        return ksSignSecret;
    }
    public void setKsMessageSecret(String ksMessageSecret) 
    {
        this.ksMessageSecret = ksMessageSecret;
    }

    public String getKsMessageSecret() 
    {
        return ksMessageSecret;
    }

    public Integer getKsOrderSynchronize() {
        return ksOrderSynchronize;
    }

    public void setKsOrderSynchronize(Integer ksOrderSynchronize) {
        this.ksOrderSynchronize = ksOrderSynchronize;
    }

    public void setDelFlag(String delFlag)
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }
    public void setKsAppName(String ksAppName) 
    {
        this.ksAppName = ksAppName;
    }

    public String getKsAppName() 
    {
        return ksAppName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("ksAppKey", getKsAppKey())
            .append("ksAppSecret", getKsAppSecret())
            .append("ksSignSecret", getKsSignSecret())
            .append("ksMessageSecret", getKsMessageSecret())
            .append("ksOrderSynchronize", getKsOrderSynchronize())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("ksAppName", getKsAppName())
            .toString();
    }
}
