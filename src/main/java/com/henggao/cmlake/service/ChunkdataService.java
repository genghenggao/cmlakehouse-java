package com.henggao.cmlake.service;

import com.henggao.cmlake.domain.Chunkdata;
import com.baomidou.mybatisplus.extension.service.IService;
import com.henggao.cmlake.domain.Chunkdata;
import com.henggao.cmlake.domain.Metadata;

/**
* @author dell
* @description 针对表【chunkdata】的数据库操作Service
* @createDate 2023-11-01 17:59:46
*/
public interface ChunkdataService extends IService<Chunkdata> {
    int insertChunkdata( Chunkdata chunkdata );
    int updateChunkdata( Chunkdata chunkdata );
    int deleteChunkdata( Chunkdata chunkdata );
    Chunkdata findChunkdataById(String id );
    Chunkdata findChunkdataByFileId( String fileId );


}
