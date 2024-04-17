package com.code.ylc.module.bpm.dal.mysql.task;

import com.code.ylc.framework.common.pojo.PageResult;
import com.code.ylc.framework.mybatis.core.mapper.BaseMapperX;
import com.code.ylc.framework.mybatis.core.query.LambdaQueryWrapperX;
import com.code.ylc.module.bpm.controller.admin.task.vo.instance.BpmProcessInstanceCopyPageReqVO;
import com.code.ylc.module.bpm.dal.dataobject.task.BpmProcessInstanceCopyDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BpmProcessInstanceCopyMapper extends BaseMapperX<BpmProcessInstanceCopyDO> {

    default PageResult<BpmProcessInstanceCopyDO> selectPage(Long loginUserId, BpmProcessInstanceCopyPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<BpmProcessInstanceCopyDO>()
                .eqIfPresent(BpmProcessInstanceCopyDO::getUserId, loginUserId)
                .likeIfPresent(BpmProcessInstanceCopyDO::getProcessInstanceName, reqVO.getProcessInstanceName())
                .betweenIfPresent(BpmProcessInstanceCopyDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(BpmProcessInstanceCopyDO::getId));
    }

}
