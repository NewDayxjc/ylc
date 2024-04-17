package com.code.ylc.module.report.convert.goview;

import com.code.ylc.framework.common.pojo.PageResult;
import com.code.ylc.module.report.controller.admin.goview.vo.project.GoViewProjectCreateReqVO;
import com.code.ylc.module.report.controller.admin.goview.vo.project.GoViewProjectRespVO;
import com.code.ylc.module.report.controller.admin.goview.vo.project.GoViewProjectUpdateReqVO;
import com.code.ylc.module.report.dal.dataobject.goview.GoViewProjectDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GoViewProjectConvert {

    GoViewProjectConvert INSTANCE = Mappers.getMapper(GoViewProjectConvert.class);

    GoViewProjectDO convert(GoViewProjectCreateReqVO bean);

    GoViewProjectDO convert(GoViewProjectUpdateReqVO bean);

    GoViewProjectRespVO convert(GoViewProjectDO bean);

    PageResult<GoViewProjectRespVO> convertPage(PageResult<GoViewProjectDO> page);

}
