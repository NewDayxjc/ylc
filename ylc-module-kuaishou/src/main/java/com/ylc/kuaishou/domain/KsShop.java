package com.ylc.kuaishou.domain;

import java.util.Date;

import com.code.ylc.framework.common.pojo.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ylc.kuaishou.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * 快手店铺配置信息对象 ks_shop
 * 
 * @author ruoyi
 * @date 2023-06-29
 */
public class KsShop extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 直播电商店铺名称 */
    @Excel(name = "直播电商店铺名称")
    private String shopName;

    /** app ID 关联ks_app表 */
    @Excel(name = "app ID 关联ks_app表")
    private String ksAppKey;

    /** 店铺ID */
    @Excel(name = "店铺ID")
    private String ksShopId;

    /** 店铺类型 */
    @Excel(name = "店铺类型")
    private String ksShopType;

    /** 店铺渠道 */
    @Excel(name = "店铺渠道")
    private String ksShopChannel;

    @Excel(name = "同步订单时间")
    private Integer ksOrderSynchronize;

    /** 商户创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "商户创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ksShopCreateTime;

    /** 商户OpenId */
    @Excel(name = "商户OpenId")
    private String openId;

    /** 商户accessToken */
    @Excel(name = "商户accessToken")
    private String accessToken;

    /** 商户refreshToken */
    @Excel(name = "商户refreshToken")
    private String refreshToken;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public Integer getKsOrderSynchronize() {
        return ksOrderSynchronize;
    }

    public void setKsOrderSynchronize(Integer ksOrderSynchronize) {
        this.ksOrderSynchronize = ksOrderSynchronize;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setShopName(String shopName) 
    {
        this.shopName = shopName;
    }

    public String getShopName() 
    {
        return shopName;
    }
    public void setKsAppKey(String ksAppKey) 
    {
        this.ksAppKey = ksAppKey;
    }

    public String getKsAppKey() 
    {
        return ksAppKey;
    }
    public void setKsShopId(String ksShopId) 
    {
        this.ksShopId = ksShopId;
    }

    public String getKsShopId() 
    {
        return ksShopId;
    }
    public void setKsShopType(String ksShopType) 
    {
        this.ksShopType = ksShopType;
    }

    public String getKsShopType() 
    {
        return ksShopType;
    }
    public void setKsShopChannel(String ksShopChannel) 
    {
        this.ksShopChannel = ksShopChannel;
    }

    public String getKsShopChannel() 
    {
        return ksShopChannel;
    }
    public void setKsShopCreateTime(Date ksShopCreateTime) 
    {
        this.ksShopCreateTime = ksShopCreateTime;
    }

    public Date getKsShopCreateTime() 
    {
        return ksShopCreateTime;
    }
    public void setOpenId(String openId) 
    {
        this.openId = openId;
    }

    public String getOpenId() 
    {
        return openId;
    }
    public void setAccessToken(String accessToken) 
    {
        this.accessToken = accessToken;
    }

    public String getAccessToken() 
    {
        return accessToken;
    }
    public void setRefreshToken(String refreshToken) 
    {
        this.refreshToken = refreshToken;
    }

    public String getRefreshToken() 
    {
        return refreshToken;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return "KsShop{" +
                "id=" + id +
                ", shopName='" + shopName + '\'' +
                ", ksAppKey='" + ksAppKey + '\'' +
                ", ksShopId='" + ksShopId + '\'' +
                ", ksShopType='" + ksShopType + '\'' +
                ", ksShopChannel='" + ksShopChannel + '\'' +
                ", ksOrderSynchronize='" + ksOrderSynchronize + '\'' +
                ", ksShopCreateTime=" + ksShopCreateTime +
                ", openId='" + openId + '\'' +
                ", accessToken='" + accessToken + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }
}
