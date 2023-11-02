package com.henggao.cmlake.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName chunkdata
 */
@TableName(value ="chunkdata")
@Data
public class Chunkdata implements Serializable {
    /**
     * 
     */
    @TableId
    private String id;

    /**
     * 
     */
    private String fileId;

    /**
     * 
     */
    private Integer n;

    /**
     * 
     */
    private byte[] data;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}