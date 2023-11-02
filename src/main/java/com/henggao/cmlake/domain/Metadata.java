package com.henggao.cmlake.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName metadata
 */
@TableName(value ="metadata")
@Data
public class Metadata implements Serializable {
    /**
     * 
     */
    @TableId
    private String id;

    /**
     * 
     */
    private String filename;

    /**
     * 
     */
    private String md5;

    /**
     * 
     */
    private Integer chunksize;

    /**
     * 
     */
    private Double length;

    /**
     * 
     */
    private Date uploaddate;

    /**
     * 
     */
    private String contenttype;

    /**
     * 
     */
    private String metadata;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}