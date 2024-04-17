package com.code.ylc.module.crm.controller.admin.product;

import com.code.ylc.framework.apilog.core.annotation.ApiAccessLog;
import com.code.ylc.framework.common.pojo.CommonResult;
import com.code.ylc.framework.common.pojo.PageParam;
import com.code.ylc.framework.common.pojo.PageResult;
import com.code.ylc.framework.common.util.object.BeanUtils;
import com.code.ylc.framework.excel.core.util.ExcelUtils;
import com.code.ylc.framework.translate.core.TranslateUtils;
import com.code.ylc.module.crm.controller.admin.product.vo.product.CrmProductPageReqVO;
import com.code.ylc.module.crm.controller.admin.product.vo.product.CrmProductRespVO;
import com.code.ylc.module.crm.controller.admin.product.vo.product.CrmProductSaveReqVO;
import com.code.ylc.module.crm.dal.dataobject.product.CrmProductDO;
import com.code.ylc.module.crm.enums.product.CrmProductStatusEnum;
import com.code.ylc.module.crm.service.product.CrmProductService;
import com.code.ylc.module.system.api.user.AdminUserApi;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

import static com.code.ylc.framework.apilog.core.enums.OperateTypeEnum.EXPORT;
import static com.code.ylc.framework.common.pojo.CommonResult.success;
import static com.code.ylc.framework.common.util.collection.CollectionUtils.convertList;

@Tag(name = "管理后台 - CRM 产品")
@RestController
@RequestMapping("/crm/product")
@Validated
public class CrmProductController {

    @Resource
    private CrmProductService productService;
    @Resource
    private AdminUserApi adminUserApi;

    @PostMapping("/create")
    @Operation(summary = "创建产品")
    @PreAuthorize("@ss.hasPermission('crm:product:create')")
    public CommonResult<Long> createProduct(@Valid @RequestBody CrmProductSaveReqVO createReqVO) {
        return success(productService.createProduct(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新产品")
    @PreAuthorize("@ss.hasPermission('crm:product:update')")
    public CommonResult<Boolean> updateProduct(@Valid @RequestBody CrmProductSaveReqVO updateReqVO) {
        productService.updateProduct(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除产品")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('crm:product:delete')")
    public CommonResult<Boolean> deleteProduct(@RequestParam("id") Long id) {
        productService.deleteProduct(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得产品")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('crm:product:query')")
    public CommonResult<CrmProductRespVO> getProduct(@RequestParam("id") Long id) {
        CrmProductDO product = productService.getProduct(id);
        return success(BeanUtils.toBean(product, CrmProductRespVO.class));
    }

    @GetMapping("/simple-list")
    @Operation(summary = "获得产品精简列表", description = "只包含被开启的产品，主要用于前端的下拉选项")
    public CommonResult<List<CrmProductRespVO>> getProductSimpleList() {
        List<CrmProductDO> list = productService.getProductListByStatus(CrmProductStatusEnum.ENABLE.getStatus());
        return success(convertList(list, product -> new CrmProductRespVO().setId(product.getId()).setName(product.getName())
                .setUnit(product.getUnit()).setNo(product.getNo()).setPrice(product.getPrice())));
    }

    @GetMapping("/page")
    @Operation(summary = "获得产品分页")
    @PreAuthorize("@ss.hasPermission('crm:product:query')")
    public CommonResult<PageResult<CrmProductRespVO>> getProductPage(@Valid CrmProductPageReqVO pageVO) {
        PageResult<CrmProductDO> pageResult = productService.getProductPage(pageVO);
        return success(BeanUtils.toBean(pageResult, CrmProductRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出产品 Excel")
    @PreAuthorize("@ss.hasPermission('crm:product:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportProductExcel(@Valid CrmProductPageReqVO exportReqVO,
                                   HttpServletResponse response) throws IOException {
        exportReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<CrmProductDO> list = productService.getProductPage(exportReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "产品.xls", "数据", CrmProductRespVO.class,
                TranslateUtils.translate(BeanUtils.toBean(list, CrmProductRespVO.class)));
    }

}
