package com.code.ylc.module.product.controller.admin.property;

import com.code.ylc.framework.common.pojo.CommonResult;
import com.code.ylc.framework.common.pojo.PageResult;
import com.code.ylc.framework.common.util.object.BeanUtils;
import com.code.ylc.module.product.controller.admin.property.vo.value.ProductPropertyValuePageReqVO;
import com.code.ylc.module.product.controller.admin.property.vo.value.ProductPropertyValueRespVO;
import com.code.ylc.module.product.controller.admin.property.vo.value.ProductPropertyValueSaveReqVO;
import com.code.ylc.module.product.dal.dataobject.property.ProductPropertyValueDO;
import com.code.ylc.module.product.service.property.ProductPropertyValueService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

import static com.code.ylc.framework.common.pojo.CommonResult.success;

@Tag(name = "管理后台 - 商品属性值")
@RestController
@RequestMapping("/product/property/value")
@Validated
public class ProductPropertyValueController {

    @Resource
    private ProductPropertyValueService productPropertyValueService;

    @PostMapping("/create")
    @Operation(summary = "创建属性值")
    @PreAuthorize("@ss.hasPermission('product:property:create')")
    public CommonResult<Long> createPropertyValue(@Valid @RequestBody ProductPropertyValueSaveReqVO createReqVO) {
        return success(productPropertyValueService.createPropertyValue(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新属性值")
    @PreAuthorize("@ss.hasPermission('product:property:update')")
    public CommonResult<Boolean> updatePropertyValue(@Valid @RequestBody ProductPropertyValueSaveReqVO updateReqVO) {
        productPropertyValueService.updatePropertyValue(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除属性值")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('product:property:delete')")
    public CommonResult<Boolean> deletePropertyValue(@RequestParam("id") Long id) {
        productPropertyValueService.deletePropertyValue(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得属性值")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('product:property:query')")
    public CommonResult<ProductPropertyValueRespVO> getPropertyValue(@RequestParam("id") Long id) {
        ProductPropertyValueDO value = productPropertyValueService.getPropertyValue(id);
        return success(BeanUtils.toBean(value, ProductPropertyValueRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得属性值分页")
    @PreAuthorize("@ss.hasPermission('product:property:query')")
    public CommonResult<PageResult<ProductPropertyValueRespVO>> getPropertyValuePage(@Valid ProductPropertyValuePageReqVO pageVO) {
        PageResult<ProductPropertyValueDO> pageResult = productPropertyValueService.getPropertyValuePage(pageVO);
        return success(BeanUtils.toBean(pageResult, ProductPropertyValueRespVO.class));
    }

}
