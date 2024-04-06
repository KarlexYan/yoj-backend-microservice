package com.karlexyan.yojbackendjudgeservice.judge.codesandbox.impl;



import com.karlexyan.yojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.karlexyan.yojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.karlexyan.yojbackendmodel.model.codesandbox.ExecuteCodeResponse;
import com.karlexyan.yojbackendmodel.model.codesandbox.JudgeInfo;
import com.karlexyan.yojbackendmodel.model.enums.JudgeInfoMessageEnum;
import com.karlexyan.yojbackendmodel.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

/**
 * 实例代码沙箱（测试跑通业务流程用）
 */
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();

        // 设置响应信息
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());

        // 设置判题信息
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);

        executeCodeResponse.setJudgeInfo(judgeInfo);

        return executeCodeResponse;
    }
}
