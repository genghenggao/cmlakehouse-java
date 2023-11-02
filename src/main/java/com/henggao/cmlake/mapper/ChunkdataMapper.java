package com.henggao.cmlake.mapper;

import com.henggao.cmlake.domain.Chunkdata;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author dell
 * @description 针对表【chunkdata】的数据库操作Mapper
 * @createDate 2023-11-01 17:59:46
 * @Entity com.henggao.cmlake.domain.Chunkdata
 */
public interface ChunkdataMapper extends BaseMapper<Chunkdata> {
    @Select("select * from chunkdata where file_id = #{fileId}")
    Chunkdata  selectByFileId(@Param("fileId") String fileId);
}




