package com.karlexyan.yojbackendjudgeservice.controller.inner;

import com.karlexyan.yojbackendjudgeservice.judge.JudgeService;
import com.karlexyan.yojbackendmodel.model.entity.QuestionSubmit;
import com.karlexyan.yojbackendserviceclient.service.JudgeFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 判题内部服务（仅内部调用）
 */
@RestController
@RequestMapping("/inner")
public class JudgeInnerController implements JudgeFeignClient {
    @Resource
    private JudgeService judgeService;

    /**
     * 判题
     *
     * @param questionSubmitId
     * @return
     */
    @Override
    public QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId) {
        return judgeService.doJudge(questionSubmitId);
    }
}
