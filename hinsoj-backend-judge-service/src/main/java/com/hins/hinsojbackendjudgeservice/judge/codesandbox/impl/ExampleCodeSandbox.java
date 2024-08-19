package com.hins.hinsojbackendjudgeservice.judge.codesandbox.impl;


import com.hins.hinsojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.hins.hinsojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.hins.hinsojbackendmodel.model.codesandbox.ExecuteCodeResponse;
import com.hins.hinsojbackendmodel.model.codesandbox.JudgeInfo;
import com.hins.hinsojbackendmodel.model.enums.JudgeInfoMessageEnum;
import com.hins.hinsojbackendmodel.model.enums.QuestionSubmitStatusEnum;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 示例代码沙箱
 */
@Slf4j
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();

        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCESS.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);

        executeCodeResponse.setJudgeInfo(judgeInfo);
        System.out.println("示例代码沙箱");
        return executeCodeResponse;
    }
}
