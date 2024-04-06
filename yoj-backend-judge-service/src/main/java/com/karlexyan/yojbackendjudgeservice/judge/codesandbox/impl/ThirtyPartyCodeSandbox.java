package com.karlexyan.yojbackendjudgeservice.judge.codesandbox.impl;


import com.karlexyan.yojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.karlexyan.yojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.karlexyan.yojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（用于调用网上现成的代码沙箱）
 */
public class ThirtyPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
