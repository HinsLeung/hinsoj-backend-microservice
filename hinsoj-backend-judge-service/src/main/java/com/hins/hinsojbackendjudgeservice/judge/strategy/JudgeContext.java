package com.hins.hinsojbackendjudgeservice.judge.strategy;

import com.hins.hinsojbackendmodel.model.codesandbox.JudgeInfo;
import com.hins.hinsojbackendmodel.model.dto.question.JudgeCase;
import com.hins.hinsojbackendmodel.model.entity.Question;
import com.hins.hinsojbackendmodel.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;
}
