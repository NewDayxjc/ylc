package com.code.ylc.module.trade.job.order;

import com.code.ylc.framework.quartz.core.handler.JobHandler;
import com.code.ylc.framework.tenant.core.job.TenantJob;
import com.code.ylc.module.trade.service.order.TradeOrderUpdateService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 交易订单的自动过期 Job
 *
 * @author 芋道源码
 */
@Component
public class TradeOrderAutoCancelJob implements JobHandler {

    @Resource
    private TradeOrderUpdateService tradeOrderUpdateService;

    @Override
    @TenantJob
    public String execute(String param) {
        int count = tradeOrderUpdateService.cancelOrderBySystem();
        return String.format("过期订单 %s 个", count);
    }

}
