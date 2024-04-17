package com.code.ylc.module.erp.controller.admin.purchase.vo.order;

import com.code.ylc.framework.common.pojo.PageParam;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

import static com.code.ylc.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - ERP 采购订单分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ErpPurchaseOrderPageReqVO extends PageParam {

    /**
     * 入库状态 - 无
     */
    public static final Integer IN_STATUS_NONE = 0;
    /**
     * 入库状态 - 部分
     */
    public static final Integer IN_STATUS_PART = 1;
    /**
     * 入库状态 - 全部
     */
    public static final Integer IN_STATUS_ALL = 2;

    /**
     * 退货状态 - 无
     */
    public static final Integer RETURN_STATUS_NONE = 0;
    /**
     * 退货状态 - 部分
     */
    public static final Integer RETURN_STATUS_PART = 1;
    /**
     * 退货状态 - 全部
     */
    public static final Integer RETURN_STATUS_ALL = 2;

    @Schema(description = "采购单编号", example = "XS001")
    private String no;

    @Schema(description = "供应商编号", example = "1724")
    private Long supplierId;

    @Schema(description = "采购时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] orderTime;

    @Schema(description = "备注", example = "你猜")
    private String remark;

    @Schema(description = "采购状态", example = "2")
    private Integer status;

    @Schema(description = "创建者")
    private String creator;

    @Schema(description = "产品编号", example = "1")
    private Long productId;

    @Schema(description = "入库状态", example = "2")
    private Integer inStatus;

    @Schema(description = "退货状态", example = "2")
    private Integer returnStatus;

    @Schema(description = "是否可入库", example = "true")
    private Boolean inEnable;

    @Schema(description = "是否可退货", example = "true")
    private Boolean returnEnable;

}