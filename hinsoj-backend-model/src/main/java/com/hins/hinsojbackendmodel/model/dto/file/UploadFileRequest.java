package com.hins.hinsojbackendmodel.model.dto.file;

import lombok.Data;

import java.io.Serializable;

/**
 * 文件上传请求
 *
 * @author HinsLeung
 * @from <a href="https://github.com/HinsLeung/hinsoj-backend"> HinsLeungOJ后端代码 </a> 
 */
@Data
public class UploadFileRequest implements Serializable {

    /**
     * 业务
     */
    private String biz;

    private static final long serialVersionUID = 1L;
}