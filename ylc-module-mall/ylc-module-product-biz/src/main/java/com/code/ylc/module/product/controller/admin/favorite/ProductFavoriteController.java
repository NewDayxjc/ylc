package com.code.ylc.module.product.controller.admin.favorite;

import cn.hutool.core.collection.CollUtil;
import com.code.ylc.framework.common.pojo.CommonResult;
import com.code.ylc.framework.common.pojo.PageResult;
import com.code.ylc.module.product.controller.admin.favorite.vo.ProductFavoritePageReqVO;
import com.code.ylc.module.product.controller.admin.favorite.vo.ProductFavoriteRespVO;
import com.code.ylc.module.product.convert.favorite.ProductFavoriteConvert;
import com.code.ylc.module.product.dal.dataobject.favorite.ProductFavoriteDO;
import com.code.ylc.module.product.dal.dataobject.spu.ProductSpuDO;
import com.code.ylc.module.product.service.favorite.ProductFavoriteService;
import com.code.ylc.module.product.service.spu.ProductSpuService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

import static com.code.ylc.framework.common.pojo.CommonResult.success;
import static com.code.ylc.framework.common.util.collection.CollectionUtils.convertSet;

@Tag(name = "管理后台 - 商品收藏")
@RestController
@RequestMapping("/product/favorite")
@Validated
public class ProductFavoriteController {

    @Resource
    private ProductFavoriteService productFavoriteService;

    @Resource
    private ProductSpuService productSpuService;

    @GetMapping("/page")
    @Operation(summary = "获得商品收藏分页")
    @PreAuthorize("@ss.hasPermission('product:favorite:query')")
    public CommonResult<PageResult<ProductFavoriteRespVO>> getFavoritePage(@Valid ProductFavoritePageReqVO pageVO) {
        PageResult<ProductFavoriteDO> pageResult = productFavoriteService.getFavoritePage(pageVO);
        if (CollUtil.isEmpty(pageResult.getList())) {
            return success(PageResult.empty());
        }
        // 拼接数据
        List<ProductSpuDO> spuList = productSpuService.getSpuList(convertSet(pageResult.getList(), ProductFavoriteDO::getSpuId));
        return success(ProductFavoriteConvert.INSTANCE.convertPage(pageResult, spuList));
    }

}
