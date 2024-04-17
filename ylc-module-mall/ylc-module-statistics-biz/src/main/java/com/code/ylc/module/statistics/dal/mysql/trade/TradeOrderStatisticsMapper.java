package com.code.ylc.module.statistics.dal.mysql.trade;

import com.code.ylc.framework.mybatis.core.mapper.BaseMapperX;
import com.code.ylc.module.statistics.controller.admin.trade.vo.TradeOrderSummaryRespVO;
import com.code.ylc.module.statistics.controller.admin.trade.vo.TradeOrderTrendRespVO;
import com.code.ylc.module.statistics.dal.dataobject.trade.TradeStatisticsDO;
import com.code.ylc.module.statistics.service.member.bo.MemberAreaStatisticsRespBO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 交易订单的统计 Mapper
 *
 * @author owen
 */
@Mapper
public interface TradeOrderStatisticsMapper extends BaseMapperX<TradeStatisticsDO> {

    List<MemberAreaStatisticsRespBO> selectSummaryListByAreaId();

    Integer selectCountByCreateTimeBetween(@Param("beginTime") LocalDateTime beginTime,
                                           @Param("endTime") LocalDateTime endTime);

    Integer selectCountByPayTimeBetween(@Param("beginTime") LocalDateTime beginTime,
                                        @Param("endTime") LocalDateTime endTime);

    Integer selectSummaryPriceByPayTimeBetween(@Param("beginTime") LocalDateTime beginTime,
                                               @Param("endTime") LocalDateTime endTime);

    Integer selectUserCountByCreateTimeBetween(@Param("beginTime") LocalDateTime beginTime,
                                               @Param("endTime") LocalDateTime endTime);

    Integer selectUserCountByPayTimeBetween(@Param("beginTime") LocalDateTime beginTime,
                                            @Param("endTime") LocalDateTime endTime);

    /**
     * 按照支付时间统计订单（按天分组）
     *
     * @param beginTime 支付起始时间
     * @param endTime   支付截止时间
     * @return 订单统计列表
     */
    List<TradeOrderTrendRespVO> selectListByPayTimeBetweenAndGroupByDay(@Param("beginTime") LocalDateTime beginTime,
                                                                        @Param("endTime") LocalDateTime endTime);

    /**
     * 按照支付时间统计订单（按月分组）
     *
     * @param beginTime 支付起始时间
     * @param endTime   支付截止时间
     * @return 订单统计列表
     */
    List<TradeOrderTrendRespVO> selectListByPayTimeBetweenAndGroupByMonth(@Param("beginTime") LocalDateTime beginTime,
                                                                          @Param("endTime") LocalDateTime endTime);

    Long selectCountByStatusAndDeliveryType(@Param("status") Integer status, @Param("deliveryType") Integer deliveryType);

    TradeOrderSummaryRespVO selectPaySummaryByStatusAndPayTimeBetween(@Param("status") Integer status,
                                                                      @Param("beginTime") LocalDateTime beginTime,
                                                                      @Param("endTime") LocalDateTime endTime);

}
