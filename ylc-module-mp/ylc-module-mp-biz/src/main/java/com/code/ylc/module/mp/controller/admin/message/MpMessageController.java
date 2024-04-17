package com.code.ylc.module.mp.controller.admin.message;

import com.code.ylc.framework.common.pojo.CommonResult;
import com.code.ylc.framework.common.pojo.PageResult;
import com.code.ylc.module.mp.controller.admin.message.vo.message.MpMessagePageReqVO;
import com.code.ylc.module.mp.controller.admin.message.vo.message.MpMessageRespVO;
import com.code.ylc.module.mp.controller.admin.message.vo.message.MpMessageSendReqVO;
import com.code.ylc.module.mp.convert.message.MpMessageConvert;
import com.code.ylc.module.mp.dal.dataobject.message.MpMessageDO;
import com.code.ylc.module.mp.service.message.MpMessageService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

import static com.code.ylc.framework.common.pojo.CommonResult.success;

@Tag(name = "管理后台 - 公众号消息")
@RestController
@RequestMapping("/mp/message")
@Validated
public class MpMessageController {

    @Resource
    private MpMessageService mpMessageService;

    @GetMapping("/page")
    @Operation(summary = "获得公众号消息分页")
    @PreAuthorize("@ss.hasPermission('mp:message:query')")
    public CommonResult<PageResult<MpMessageRespVO>> getMessagePage(@Valid MpMessagePageReqVO pageVO) {
        PageResult<MpMessageDO> pageResult = mpMessageService.getMessagePage(pageVO);
        return success(MpMessageConvert.INSTANCE.convertPage(pageResult));
    }

    @PostMapping("/send")
    @Operation(summary = "给粉丝发送消息")
    @PreAuthorize("@ss.hasPermission('mp:message:send')")
    public CommonResult<MpMessageRespVO> sendMessage(@Valid @RequestBody MpMessageSendReqVO reqVO) {
        MpMessageDO message = mpMessageService.sendKefuMessage(reqVO);
        return success(MpMessageConvert.INSTANCE.convert(message));
    }

}