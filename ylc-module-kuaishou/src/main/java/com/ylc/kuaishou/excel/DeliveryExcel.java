package com.ylc.kuaishou.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ylc.kuaishou.annotation.Excel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DeliveryExcel {

    /** 原始单号 */
    @ExcelProperty(value = "原始单号",index = 0)
    @Excel(name = "原始单号")
    private String native_number;

    /** 店铺 */
    @Excel(name = "店铺")
    @ExcelProperty(  value = "店铺",index = 1)
    private String shop;

    /** 物流公司 */
    @Excel(name = "物流公司")
    @ExcelProperty(value = "物流公司",index = 2)
    private String deliveryCompany;
    /** 物流单号 */
    @Excel(name = "物流单号")
    @ExcelProperty(value = "物流单号",index = 3)
    private String deliveryNumber;

    @Excel(name = "序列号")
    @ExcelProperty( value = "序列号",index = 4)
    private String serialNumber;



    /** 发货时间 */
    @Excel(name = "发货时间", width = 30, dateFormat = "yyyy-MM-dd")
    @ExcelProperty( value = "发货时间",index = 5)
    private String deliveryTime;


    /** 发货时间 */
    @Excel(name = "签收时间", width = 30, dateFormat = "yyyy-MM-dd")
    @ExcelProperty( value = "签收时间",index = 6)
    private String signTime;

    /** 发货时间 */
    @Excel(name = "签收状态", width = 30)
    @ExcelProperty( value = "签收状态",index = 7)
    private String signStatus;

}
