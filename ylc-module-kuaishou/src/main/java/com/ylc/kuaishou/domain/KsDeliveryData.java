package com.ylc.kuaishou.domain;

import java.util.Date;

import com.code.ylc.framework.common.pojo.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ylc.kuaishou.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * 快递物流数据对象 ks_delivery_data
 * 
 * @author ruoyi
 * @date 2023-06-30
 */
public class KsDeliveryData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 快递记录ID */
    @Excel(name = "快递记录ID")
    private Long deliveryRecordId;

    /** 物流公司 */
    @Excel(name = "物流公司")
    private String deliveryName;

    /** 物流单号 */
    @Excel(name = "物流单号")
    private String deliveryNumber;

    /** 发货时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发货时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deliveryTime;

    /** 0：失败 1：已完成 */
    @Excel(name = "导入状态 0：失败 1：已完成")
    private String status;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String shopName;

    /** 原始单号 */
    @Excel(name = "原始单号")
    private String nativeNumber;

    /** 序列号 */
    @Excel(name = "序列号")
    private String serialNumber;

    /** 描述 */
    @Excel(name = "描述")
    private String deliveryDescribe;


    /** 发货时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "签收时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date signTime;

    /** 发货时间 */
    @Excel(name = "签收状态", width = 30)
    private String signStatus;



    public String getSignStatus() {
        return signStatus;
    }

    public void setSignStatus(String signStatus) {
        this.signStatus = signStatus;
    }


    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDeliveryRecordId(Long deliveryRecordId) 
    {
        this.deliveryRecordId = deliveryRecordId;
    }

    public Long getDeliveryRecordId() 
    {
        return deliveryRecordId;
    }
    public void setDeliveryName(String deliveryName) 
    {
        this.deliveryName = deliveryName;
    }

    public String getDeliveryName() 
    {
        return deliveryName;
    }
    public void setDeliveryNumber(String deliveryNumber) 
    {
        this.deliveryNumber = deliveryNumber;
    }

    public String getDeliveryNumber() 
    {
        return deliveryNumber;
    }
    public void setDeliveryTime(Date deliveryTime) 
    {
        this.deliveryTime = deliveryTime;
    }

    public Date getDeliveryTime() 
    {
        return deliveryTime;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setShopName(String shopName) 
    {
        this.shopName = shopName;
    }

    public String getShopName() 
    {
        return shopName;
    }
    public void setNativeNumber(String nativeNumber) 
    {
        this.nativeNumber = nativeNumber;
    }

    public String getNativeNumber() 
    {
        return nativeNumber;
    }
    public void setSerialNumber(String serialNumber) 
    {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() 
    {
        return serialNumber;
    }
    public void setDeliveryDescribe(String deliveryDescribe) 
    {
        this.deliveryDescribe = deliveryDescribe;
    }

    public String getDeliveryDescribe() 
    {
        return deliveryDescribe;
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
        return "KsDeliveryData{" +
                "id=" + id +
                ", deliveryRecordId=" + deliveryRecordId +
                ", deliveryName='" + deliveryName + '\'' +
                ", deliveryNumber='" + deliveryNumber + '\'' +
                ", deliveryTime=" + deliveryTime +
                ", status='" + status + '\'' +
                ", shopName='" + shopName + '\'' +
                ", nativeNumber='" + nativeNumber + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", deliveryDescribe='" + deliveryDescribe + '\'' +
                ", signTime='" + signTime + '\'' +
                ", signStatus='" + signStatus + '\'' +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }
}
