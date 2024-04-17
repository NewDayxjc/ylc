package com.code.ylc.module.promotion.api.coupon;


import com.code.ylc.module.promotion.api.coupon.dto.CouponRespDTO;
import com.code.ylc.module.promotion.api.coupon.dto.CouponUseReqDTO;
import com.code.ylc.module.promotion.api.coupon.dto.CouponValidReqDTO;
import com.code.ylc.module.promotion.convert.coupon.CouponConvert;
import com.code.ylc.module.promotion.dal.dataobject.coupon.CouponDO;
import com.code.ylc.module.promotion.service.coupon.CouponService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;

/**
 * 优惠劵 API 实现类
 *
 * @author 芋道源码
 */
@Service
@Validated
public class CouponApiImpl implements CouponApi {

    @Resource
    private CouponService couponService;

    @Override
    public void useCoupon(CouponUseReqDTO useReqDTO) {
        couponService.useCoupon(useReqDTO.getId(), useReqDTO.getUserId(),
                useReqDTO.getOrderId());
    }

    @Override
    public void returnUsedCoupon(Long id) {
        couponService.returnUsedCoupon(id);
    }

    @Override
    public CouponRespDTO validateCoupon(CouponValidReqDTO validReqDTO) {
        CouponDO coupon = couponService.validCoupon(validReqDTO.getId(), validReqDTO.getUserId());
        return CouponConvert.INSTANCE.convert(coupon);
    }

}
