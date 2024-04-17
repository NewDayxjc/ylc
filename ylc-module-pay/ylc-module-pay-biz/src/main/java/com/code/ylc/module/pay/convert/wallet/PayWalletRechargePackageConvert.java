package com.code.ylc.module.pay.convert.wallet;

import java.util.*;

import com.code.ylc.framework.common.pojo.PageResult;

import com.code.ylc.module.pay.controller.admin.wallet.vo.rechargepackage.WalletRechargePackageCreateReqVO;
import com.code.ylc.module.pay.controller.admin.wallet.vo.rechargepackage.WalletRechargePackageRespVO;
import com.code.ylc.module.pay.controller.admin.wallet.vo.rechargepackage.WalletRechargePackageUpdateReqVO;
import com.code.ylc.module.pay.dal.dataobject.wallet.PayWalletRechargePackageDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PayWalletRechargePackageConvert {

    PayWalletRechargePackageConvert INSTANCE = Mappers.getMapper(PayWalletRechargePackageConvert.class);

    PayWalletRechargePackageDO convert(WalletRechargePackageCreateReqVO bean);

    PayWalletRechargePackageDO convert(WalletRechargePackageUpdateReqVO bean);

    WalletRechargePackageRespVO convert(PayWalletRechargePackageDO bean);

    List<WalletRechargePackageRespVO> convertList(List<PayWalletRechargePackageDO> list);

    PageResult<WalletRechargePackageRespVO> convertPage(PageResult<PayWalletRechargePackageDO> page);

}
