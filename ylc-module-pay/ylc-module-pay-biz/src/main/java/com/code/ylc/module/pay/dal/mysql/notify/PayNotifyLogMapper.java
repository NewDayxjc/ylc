package com.code.ylc.module.pay.dal.mysql.notify;

import com.code.ylc.module.pay.dal.dataobject.notify.PayNotifyLogDO;
import com.code.ylc.framework.mybatis.core.mapper.BaseMapperX;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PayNotifyLogMapper extends BaseMapperX<PayNotifyLogDO> {

    default List<PayNotifyLogDO> selectListByTaskId(Long taskId) {
        return selectList(PayNotifyLogDO::getTaskId, taskId);
    }

}
