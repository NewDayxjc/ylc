package com.code.ylc.module.crm.job.customer;

import com.code.ylc.framework.quartz.core.handler.JobHandler;
import com.code.ylc.framework.tenant.core.job.TenantJob;
import com.code.ylc.module.crm.service.customer.CrmCustomerService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 客户自动掉入公海 Job
 *
 * @author 芋道源码
 */
@Component
public class CrmCustomerAutoPutPoolJob implements JobHandler {

    @Resource
    private CrmCustomerService customerService;

    @Override
    @TenantJob
    public String execute(String param) {
        int count = customerService.autoPutCustomerPool();
        return String.format("掉入公海客户 %s 个", count);
    }

}