package com.code.ylc.module.pay.convert.transfer;

import com.code.ylc.framework.common.pojo.PageResult;
import com.code.ylc.framework.pay.core.client.dto.transfer.PayTransferUnifiedReqDTO;
import com.code.ylc.module.pay.api.transfer.dto.PayTransferCreateReqDTO;
import com.code.ylc.module.pay.controller.admin.demo.vo.transfer.PayDemoTransferCreateReqVO;
import com.code.ylc.module.pay.controller.admin.transfer.vo.PayTransferCreateReqVO;
import com.code.ylc.module.pay.controller.admin.transfer.vo.PayTransferPageItemRespVO;
import com.code.ylc.module.pay.controller.admin.transfer.vo.PayTransferRespVO;
import com.code.ylc.module.pay.dal.dataobject.transfer.PayTransferDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PayTransferConvert {

    PayTransferConvert INSTANCE = Mappers.getMapper(PayTransferConvert.class);

    PayTransferDO convert(PayTransferCreateReqDTO dto);

    PayTransferUnifiedReqDTO convert2(PayTransferDO dto);

    PayTransferCreateReqDTO convert(PayTransferCreateReqVO vo);

    PayTransferCreateReqDTO convert(PayDemoTransferCreateReqVO vo);

    PayTransferRespVO  convert(PayTransferDO bean);

    PageResult<PayTransferPageItemRespVO> convertPage(PageResult<PayTransferDO> pageResult);
}
