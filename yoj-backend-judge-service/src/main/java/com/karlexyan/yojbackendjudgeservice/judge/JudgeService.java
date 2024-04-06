package com.karlexyan.yojbackendjudgeservice.judge;


import com.karlexyan.yojbackendmodel.model.entity.QuestionSubmit;

/**
 * 判题服务
 */
public interface JudgeService {

    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
