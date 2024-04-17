package com.code.ylc.module.trade.convert.aftersale;

import com.code.ylc.module.trade.dal.dataobject.aftersale.AfterSaleLogDO;
import com.code.ylc.module.trade.service.aftersale.bo.AfterSaleLogCreateReqBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AfterSaleLogConvert {

    AfterSaleLogConvert INSTANCE = Mappers.getMapper(AfterSaleLogConvert.class);

    AfterSaleLogDO convert(AfterSaleLogCreateReqBO bean);

}
