package com.karlexyan.yojbackendquestionservice.controller.inner;

import com.karlexyan.yojbackendmodel.model.entity.Question;
import com.karlexyan.yojbackendmodel.model.entity.QuestionSubmit;
import com.karlexyan.yojbackendquestionservice.service.QuestionService;
import com.karlexyan.yojbackendquestionservice.service.QuestionSubmitService;
import com.karlexyan.yojbackendserviceclient.service.QuestionFeignClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 题目内部服务（仅内部调用）
 */
@RestController
@RequestMapping("/inner")
public class QuestionInnerController implements QuestionFeignClient {

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionSubmitService questionSubmitService;

    /**
     * 根据 id 获取题目信息
     *
     * @param questionId
     * @return
     */
    @Override
    @GetMapping("/get/id")
    public Question getQuestionById(@RequestParam("questionId") long questionId) {
        return questionService.getById(questionId);
    }

    /**
     * 根据id获取题目提交信息
     * @param questionSubmitId
     * @return
     */
    @Override
    @GetMapping("/question_submit/get/id")
    public QuestionSubmit getQuestionSubmitById(@RequestParam("questionSubmitId") long questionSubmitId) {
        return questionSubmitService.getById(questionSubmitId);
    }

    /**
     * 根据id更新题目提交信息
     * @param questionSubmit
     * @return
     */
    @Override
    @PostMapping("/question_submit/update")
    public boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit) {
        return questionSubmitService.updateById(questionSubmit);
    }

    /**
     * 保存数据
     * @param question
     * @return
     */
    @Override
    @PostMapping("/question/save")
    public boolean updateQuestion(@RequestBody Question question) {
        return questionService.updateById(question);
    }
}
