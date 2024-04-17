package com.code.ylc.module.crm.controller.admin.clue.vo;

import com.code.ylc.framework.common.validation.InEnum;
import com.code.ylc.module.crm.enums.permission.CrmPermissionLevelEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Schema(description = "管理后台 - 线索转移 Request VO")
@Data
public class CrmClueTransferReqVO {

    @Schema(description = "线索编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "10430")
    @NotNull(message = "线索编号不能为空")
    private Long id;

    @Schema(description = "新负责人的用户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "10430")
    @NotNull(message = "新负责人的用户编号不能为空")
    private Long newOwnerUserId;

    @Schema(description = "老负责人加入团队后的权限级别", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @InEnum(value = CrmPermissionLevelEnum.class)
    private Integer oldOwnerPermissionLevel; // 老负责人加入团队后的权限级别。如果 null 说明移除

}