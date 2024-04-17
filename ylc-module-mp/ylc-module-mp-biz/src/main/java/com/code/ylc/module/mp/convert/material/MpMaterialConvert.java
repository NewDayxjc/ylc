package com.code.ylc.module.mp.convert.material;

import com.code.ylc.framework.common.pojo.PageResult;
import com.code.ylc.module.mp.controller.admin.material.vo.MpMaterialRespVO;
import com.code.ylc.module.mp.controller.admin.material.vo.MpMaterialUploadRespVO;
import com.code.ylc.module.mp.dal.dataobject.account.MpAccountDO;
import com.code.ylc.module.mp.dal.dataobject.material.MpMaterialDO;
import me.chanjar.weixin.mp.bean.material.WxMpMaterial;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.io.File;

@Mapper
public interface MpMaterialConvert {

    MpMaterialConvert INSTANCE = Mappers.getMapper(MpMaterialConvert.class);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(source = "account.id", target = "accountId"),
            @Mapping(source = "account.appId", target = "appId"),
            @Mapping(source = "name", target = "name")
    })
    MpMaterialDO convert(String mediaId, String type, String url, MpAccountDO account,
                         String name);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(source = "account.id", target = "accountId"),
            @Mapping(source = "account.appId", target = "appId"),
            @Mapping(source = "name", target = "name")
    })
    MpMaterialDO convert(String mediaId, String type, String url, MpAccountDO account,
                         String name, String title, String introduction, String mpUrl);

    MpMaterialUploadRespVO convert(MpMaterialDO bean);

    default WxMpMaterial convert(String name, File file, String title, String introduction) {
        return new WxMpMaterial(name, file, title, introduction);
    }

    PageResult<MpMaterialRespVO> convertPage(PageResult<MpMaterialDO> page);

}
