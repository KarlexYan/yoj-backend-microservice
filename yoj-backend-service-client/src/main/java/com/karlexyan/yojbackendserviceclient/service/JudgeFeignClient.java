package com.karlexyan.yojbackendserviceclient.service;


import com.karlexyan.yojbackendmodel.model.entity.QuestionSubmit;

/**
 * 判题服务
 */
public interface JudgeFeignClient {

    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
