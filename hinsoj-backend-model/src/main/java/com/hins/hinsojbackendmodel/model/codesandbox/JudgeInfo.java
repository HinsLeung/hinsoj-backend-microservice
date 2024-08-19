package com.hins.hinsojbackendmodel.model.codesandbox;

import lombok.Data;

/**
 * 题目判题信息
 */
@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存（KB）
     */
    private Long memory;

    /**
     * 消耗时间（ms）
     */
    private Long time;
}
