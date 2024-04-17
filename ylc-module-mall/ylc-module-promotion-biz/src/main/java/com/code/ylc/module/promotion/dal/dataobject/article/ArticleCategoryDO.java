package com.code.ylc.module.promotion.dal.dataobject.article;

import com.code.ylc.framework.common.enums.CommonStatusEnum;
import com.code.ylc.framework.mybatis.core.dataobject.BaseDO;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * 文章分类 DO
 *
 * @author HUIHUI
 */
@TableName("promotion_article_category")
@KeySequence("promotion_article_category_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleCategoryDO extends BaseDO {

    /**
     * 文章分类编号
     */
    @TableId
    private Long id;
    /**
     * 文章分类名称
     */
    private String name;
    /**
     * 图标地址
     */
    private String picUrl;
    /**
     * 状态
     *
     * 枚举 {@link CommonStatusEnum}
     */
    private Integer status;
    /**
     * 排序
     */
    private Integer sort;

}