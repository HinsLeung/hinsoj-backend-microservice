package com.hins.hinsojbackendjudgeservice.judge.codesandbox;


import com.hins.hinsojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.hins.hinsojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
