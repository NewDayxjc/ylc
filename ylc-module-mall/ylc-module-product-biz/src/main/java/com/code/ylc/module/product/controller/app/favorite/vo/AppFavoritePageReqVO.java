package com.code.ylc.module.product.controller.app.favorite.vo;

import com.code.ylc.framework.common.pojo.PageParam;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "用户 App - 商品收藏分页查询 Request VO")
@Data
public class AppFavoritePageReqVO extends PageParam {
}
