package com.henggao.cmlake.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.henggao.cmlake.domain.Chunkdata;
import com.henggao.cmlake.domain.Chunkdata;
import com.henggao.cmlake.domain.Metadata;
import com.henggao.cmlake.service.ChunkdataService;
import com.henggao.cmlake.mapper.ChunkdataMapper;
import org.springframework.stereotype.Service;

/**
* @author dell
* @description 针对表【chunkdata】的数据库操作Service实现
* @createDate 2023-11-01 17:59:46
*/
@Service
public class ChunkdataServiceImpl extends ServiceImpl<ChunkdataMapper, Chunkdata>
    implements ChunkdataService{

    // 增
    @Override
    public int insertChunkdata(Chunkdata chunkdata) {
        return baseMapper.insert( chunkdata );
    }

    // 改
    @Override
    public int updateChunkdata(Chunkdata chunkdata) {
        return baseMapper.updateById( chunkdata );
    }

    // 删
    @Override
    public int deleteChunkdata(Chunkdata chunkdata) {
        return baseMapper.deleteById( chunkdata.getId() );
    }


    // 查根据id
    @Override
    public Chunkdata findChunkdataById(String id ) {
        return baseMapper.selectById(id);
    }


    // 查
    @Override
    public Chunkdata findChunkdataByFileId( String fileId ) {
        return baseMapper.selectByFileId(fileId);
    }

}




