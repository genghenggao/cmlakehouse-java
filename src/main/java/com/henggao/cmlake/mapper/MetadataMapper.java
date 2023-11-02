package com.henggao.cmlake.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.henggao.cmlake.domain.Metadata;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;


/**
 * @author dell
 * @description 针对表【metadata】的数据库操作Mapper
 * @createDate 2023-11-01 17:14:57
 * @Entity com.henggao.cmlake.domain.Metadata
 */
public interface MetadataMapper extends BaseMapper<Metadata> {

    // 分页查询
    IPage<Metadata> selectByPage(IPage<Metadata> userPage, @Param(Constants.WRAPPER) Wrapper<Metadata> userWrapper);

}




