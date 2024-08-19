package com.hins.hinsojbackendjudgeservice.judge;


import com.hins.hinsojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.hins.hinsojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.hins.hinsojbackendjudgeservice.judge.strategy.JudgeContext;
import com.hins.hinsojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.hins.hinsojbackendmodel.model.codesandbox.JudgeInfo;
import com.hins.hinsojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext){
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if(language.equals("java")){
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
