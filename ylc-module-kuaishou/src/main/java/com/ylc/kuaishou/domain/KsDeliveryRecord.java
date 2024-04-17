package com.ylc.kuaishou.domain;

import com.code.ylc.framework.common.pojo.BaseEntity;
import com.ylc.kuaishou.annotation.Excel;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * 快递记录管理对象 ks_delivery_record
 * 
 * @author xiong
 * @date 2023-06-30
 */

public class KsDeliveryRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 总数 */
    @Excel(name = "总数")
    private Integer total;

    /** 导入成功数量 */
    @Excel(name = "导入成功数量")
    private Integer totalSuccess;

    /** 导入失败数量 */
    @Excel(name = "导入失败数量")
    private Integer totalFail;

    /** 0：失败 1：已完成 */
    @Excel(name = "0：失败 1：已完成")
    private String status;

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

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotalSuccess() {
        return totalSuccess;
    }

    public void setTotalSuccess(Integer totalSuccess) {
        this.totalSuccess = totalSuccess;
    }

    public Integer getTotalFail() {
        return totalFail;
    }

    public void setTotalFail(Integer totalFail) {
        this.totalFail = totalFail;
    }

    @Override
    public String toString() {
        return "KsDeliveryRecord{" +
                "id=" + id +
                ", total=" + total +
                ", totalSuccess=" + totalSuccess +
                ", totalFail=" + totalFail +
                ", status='" + status + '\'' +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }
}
