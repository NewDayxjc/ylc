package com.code.ylc.module.trade.dal.mysql.delivery;


import com.code.ylc.framework.common.pojo.PageResult;
import com.code.ylc.framework.mybatis.core.mapper.BaseMapperX;
import com.code.ylc.framework.mybatis.core.query.LambdaQueryWrapperX;
import com.code.ylc.module.trade.controller.admin.delivery.vo.expresstemplate.DeliveryExpressTemplatePageReqVO;
import com.code.ylc.module.trade.dal.dataobject.delivery.DeliveryExpressTemplateDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeliveryExpressTemplateMapper extends BaseMapperX<DeliveryExpressTemplateDO> {

    default PageResult<DeliveryExpressTemplateDO> selectPage(DeliveryExpressTemplatePageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<DeliveryExpressTemplateDO>()
                .likeIfPresent(DeliveryExpressTemplateDO::getName, reqVO.getName())
                .eqIfPresent(DeliveryExpressTemplateDO::getChargeMode, reqVO.getChargeMode())
                .betweenIfPresent(DeliveryExpressTemplateDO::getCreateTime, reqVO.getCreateTime())
                .orderByAsc(DeliveryExpressTemplateDO::getSort));
    }

    default DeliveryExpressTemplateDO selectByName(String name) {
        return selectOne(DeliveryExpressTemplateDO::getName,name);
    }

}
