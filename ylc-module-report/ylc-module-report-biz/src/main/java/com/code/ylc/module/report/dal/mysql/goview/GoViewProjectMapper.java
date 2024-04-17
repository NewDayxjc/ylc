package com.code.ylc.module.report.dal.mysql.goview;

import com.code.ylc.framework.common.pojo.PageParam;
import com.code.ylc.framework.common.pojo.PageResult;
import com.code.ylc.framework.mybatis.core.mapper.BaseMapperX;
import com.code.ylc.framework.mybatis.core.query.LambdaQueryWrapperX;
import com.code.ylc.module.report.dal.dataobject.goview.GoViewProjectDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoViewProjectMapper extends BaseMapperX<GoViewProjectDO> {

    default PageResult<GoViewProjectDO> selectPage(PageParam reqVO, Long userId) {
        return selectPage(reqVO, new LambdaQueryWrapperX<GoViewProjectDO>()
                .eq(GoViewProjectDO::getCreator, userId)
                .orderByDesc(GoViewProjectDO::getId));
    }

}
