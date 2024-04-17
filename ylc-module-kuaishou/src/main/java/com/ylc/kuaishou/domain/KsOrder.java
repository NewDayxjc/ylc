package com.ylc.kuaishou.domain;

import java.beans.Transient;
import java.util.Date;

import com.code.ylc.framework.common.pojo.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ylc.kuaishou.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * 快手平台订单对象 ks_order
 * 
 * @author xiong
 * @date 2023-07-03
 */
public class KsOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单ID */
    @Excel(name = "订单号")
    private Long orderId;

    /** 订单状态 */
    @Excel(name = "订单状态",readConverterExp = "0=未知状态,10=待付款,30=已付款,40=已发货,50=已签收,70=订单成功,80=订单失败")
    private String orderStatus;

    /** 客户昵称 */
    @Excel(name = "客户昵称")
    private String ksBuyerNick;

    /** 客户留言 */
    @Excel(name = "客户留言")
    private String ksBuyerRemark;

    /** appkey */
    @Excel(name = "appkey")
    private String appKey;

    /** 商户openID */
    @Excel(name = "商户openID")
    private String openId;

    /** 店铺名 */
    @Excel(name = "店铺名")
    private String ksShopName;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String ksOrderMobile;

    /** 实名姓名 */
    @Excel(name = "实名姓名")
    private String ksRealName;

    /** 身份证号码 */
    @Excel(name = "身份证号码")
    private String ksIdCard;

    /** 省份 */
    @Excel(name = "省份")
    private String ksProvince;

    /** 省份编码 */
    @Excel(name = "省份编码")
    private String ksProvinceCode;

    /** 城市 */
    @Excel(name = "城市")
    private String ksCity;

    /** 城市编码 */
    @Excel(name = "城市编码")
    private String ksCityCode;

    /** 区编码 */
    @Excel(name = "区编码")
    private String ksDistrictCode;

    /** 区县 */
    @Excel(name = "区县")
    private String ksDistrict;

    /** 详细地址 */
    @Excel(name = "详细地址")
    private String ksAddressDetail;

    /** 实名审核状态 */
    @Excel(name = "实名审核状态",readConverterExp = "1=通过,2=未通过")
    private String ksRealNameStatus;

    /** 物流公司 */
    @Excel(name = "物流公司")
    private String ksDeliveryName;

    /** 物流单号 */
    @Excel(name = "物流单号")
    private String ksDeliveryNumber;

    /** ICCID */
    @Excel(name = "ICCID")
    private String iccid;

    @Excel(name = "商品编码")

    private String skuNick;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 订单创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "订单创建时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date orderCreateTime;

    /** 订单发货时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "订单发货时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date orderSendTime;


    /** 发货时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "签收时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date signTime;

    /** 发货时间 */
    @Excel(name = "签收状态", width = 30)
    private String signStatus;


    @Excel(name = "年龄", width = 20)
    private Integer age;


    @Excel(name = "性别", width = 20,readConverterExp = "1=男,2=女")
    private Integer sex;

//    @Transient
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date beginTime;

    @JsonFormat(pattern = "yyyy-MM-dd")
//    @Transient
    private Date endTime;


    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public String getSignStatus() {
        return signStatus;
    }

    public void setSignStatus(String signStatus) {
        this.signStatus = signStatus;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getSkuNick() {
        return skuNick;
    }

    public void setSkuNick(String skuNick) {
        this.skuNick = skuNick;
    }

    public void setOrderId(Long orderId)
    {
        this.orderId = orderId;
    }

    public Long getOrderId() 
    {
        return orderId;
    }
    public void setOrderStatus(String orderStatus) 
    {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() 
    {
        return orderStatus;
    }
    public void setKsBuyerNick(String ksBuyerNick) 
    {
        this.ksBuyerNick = ksBuyerNick;
    }

    public String getKsBuyerNick() 
    {
        return ksBuyerNick;
    }
    public void setKsBuyerRemark(String ksBuyerRemark) 
    {
        this.ksBuyerRemark = ksBuyerRemark;
    }

    public String getKsBuyerRemark() 
    {
        return ksBuyerRemark;
    }
    public void setAppKey(String appKey) 
    {
        this.appKey = appKey;
    }

    public String getAppKey() 
    {
        return appKey;
    }
    public void setOpenId(String openId) 
    {
        this.openId = openId;
    }

    public String getOpenId() 
    {
        return openId;
    }
    public void setKsShopName(String ksShopName) 
    {
        this.ksShopName = ksShopName;
    }

    public String getKsShopName() 
    {
        return ksShopName;
    }
    public void setKsOrderMobile(String ksOrderMobile) 
    {
        this.ksOrderMobile = ksOrderMobile;
    }

    public String getKsOrderMobile() 
    {
        return ksOrderMobile;
    }
    public void setKsRealName(String ksRealName) 
    {
        this.ksRealName = ksRealName;
    }

    public String getKsRealName() 
    {
        return ksRealName;
    }
    public void setKsIdCard(String ksIdCard) 
    {
        this.ksIdCard = ksIdCard;
    }

    public String getKsIdCard() 
    {
        return ksIdCard;
    }
    public void setKsProvince(String ksProvince) 
    {
        this.ksProvince = ksProvince;
    }

    public String getKsProvince() 
    {
        return ksProvince;
    }
    public void setKsProvinceCode(String ksProvinceCode) 
    {
        this.ksProvinceCode = ksProvinceCode;
    }

    public String getKsProvinceCode() 
    {
        return ksProvinceCode;
    }
    public void setKsCity(String ksCity) 
    {
        this.ksCity = ksCity;
    }

    public String getKsCity() 
    {
        return ksCity;
    }
    public void setKsCityCode(String ksCityCode) 
    {
        this.ksCityCode = ksCityCode;
    }

    public String getKsCityCode() 
    {
        return ksCityCode;
    }
    public void setKsDistrictCode(String ksDistrictCode) 
    {
        this.ksDistrictCode = ksDistrictCode;
    }

    public String getKsDistrictCode() 
    {
        return ksDistrictCode;
    }
    public void setKsDistrict(String ksDistrict) 
    {
        this.ksDistrict = ksDistrict;
    }

    public String getKsDistrict() 
    {
        return ksDistrict;
    }
    public void setKsAddressDetail(String ksAddressDetail) 
    {
        this.ksAddressDetail = ksAddressDetail;
    }

    public String getKsAddressDetail() 
    {
        return ksAddressDetail;
    }
    public void setKsRealNameStatus(String ksRealNameStatus) 
    {
        this.ksRealNameStatus = ksRealNameStatus;
    }

    public String getKsRealNameStatus() 
    {
        return ksRealNameStatus;
    }
    public void setKsDeliveryName(String ksDeliveryName) 
    {
        this.ksDeliveryName = ksDeliveryName;
    }

    public String getKsDeliveryName() 
    {
        return ksDeliveryName;
    }
    public void setKsDeliveryNumber(String ksDeliveryNumber) 
    {
        this.ksDeliveryNumber = ksDeliveryNumber;
    }

    public String getKsDeliveryNumber() 
    {
        return ksDeliveryNumber;
    }
    public void setIccid(String iccid) 
    {
        this.iccid = iccid;
    }

    public String getIccid() 
    {
        return iccid;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }
    public void setOrderCreateTime(Date orderCreateTime) 
    {
        this.orderCreateTime = orderCreateTime;
    }

    public Date getOrderCreateTime() 
    {
        return orderCreateTime;
    }
    public void setOrderSendTime(Date orderSendTime) 
    {
        this.orderSendTime = orderSendTime;
    }

    public Date getOrderSendTime() 
    {
        return orderSendTime;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }


    @Override
    public String toString() {
        return "KsOrder{" +
                "orderId=" + orderId +
                ", orderStatus='" + orderStatus + '\'' +
                ", ksBuyerNick='" + ksBuyerNick + '\'' +
                ", ksBuyerRemark='" + ksBuyerRemark + '\'' +
                ", appKey='" + appKey + '\'' +
                ", openId='" + openId + '\'' +
                ", ksShopName='" + ksShopName + '\'' +
                ", ksOrderMobile='" + ksOrderMobile + '\'' +
                ", ksRealName='" + ksRealName + '\'' +
                ", ksIdCard='" + ksIdCard + '\'' +
                ", ksProvince='" + ksProvince + '\'' +
                ", ksProvinceCode='" + ksProvinceCode + '\'' +
                ", ksCity='" + ksCity + '\'' +
                ", ksCityCode='" + ksCityCode + '\'' +
                ", ksDistrictCode='" + ksDistrictCode + '\'' +
                ", ksDistrict='" + ksDistrict + '\'' +
                ", ksAddressDetail='" + ksAddressDetail + '\'' +
                ", ksRealNameStatus='" + ksRealNameStatus + '\'' +
                ", ksDeliveryName='" + ksDeliveryName + '\'' +
                ", ksDeliveryNumber='" + ksDeliveryNumber + '\'' +
                ", iccid='" + iccid + '\'' +
                ", skuNick='" + skuNick + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", orderCreateTime=" + orderCreateTime +
                ", orderSendTime=" + orderSendTime +
                ", signTime='" + signTime + '\'' +
                ", signStatus='" + signStatus + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                '}';
    }
}
