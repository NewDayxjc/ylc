package com.code.ylc.module.crm.service.contract;

import com.code.ylc.module.crm.controller.admin.contract.vo.config.CrmContractConfigSaveReqVO;
import com.code.ylc.module.crm.dal.dataobject.contract.CrmContractConfigDO;

import javax.validation.Valid;

/**
 * 合同配置 Service 接口
 *
 * @author 芋道源码
 */
public interface CrmContractConfigService {

    /**
     * 获得合同配置
     *
     * @return 合同配置
     */
    CrmContractConfigDO getContractConfig();

    /**
     * 保存合同配置
     *
     * @param saveReqVO 更新信息
     */
    void saveContractConfig(@Valid CrmContractConfigSaveReqVO saveReqVO);

}
