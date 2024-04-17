package com.code.ylc.module.pay.convert.demo;

import com.code.ylc.framework.common.pojo.PageResult;
import com.code.ylc.module.pay.controller.admin.demo.vo.order.PayDemoOrderCreateReqVO;
import com.code.ylc.module.pay.controller.admin.demo.vo.order.PayDemoOrderRespVO;
import com.code.ylc.module.pay.dal.dataobject.demo.PayDemoOrderDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 示例订单 Convert
 *
 * @author 芋道源码
 */
@Mapper
public interface PayDemoOrderConvert {

    PayDemoOrderConvert INSTANCE = Mappers.getMapper(PayDemoOrderConvert.class);

    PayDemoOrderDO convert(PayDemoOrderCreateReqVO bean);

    PayDemoOrderRespVO convert(PayDemoOrderDO bean);

    PageResult<PayDemoOrderRespVO> convertPage(PageResult<PayDemoOrderDO> page);

}
