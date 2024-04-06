package com.karlexyan.yojbackendjudgeservice.judge.codesandbox;


import com.karlexyan.yojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.karlexyan.yojbackendmodel.model.codesandbox.ExecuteCodeResponse;

public interface CodeSandbox {

    /**
     * 代码沙箱执行代码接口
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
