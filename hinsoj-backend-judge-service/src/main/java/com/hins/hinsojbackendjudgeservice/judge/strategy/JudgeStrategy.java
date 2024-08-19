package com.hins.hinsojbackendjudgeservice.judge.strategy;

import com.hins.hinsojbackendmodel.model.codesandbox.JudgeInfo;

/**
 * 判题策略
 */
public interface JudgeStrategy {

    JudgeInfo doJudge(JudgeContext judgeContext);
}
