package com.henggao.cmlake.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.henggao.cmlake.domain.Metadata;
import com.henggao.cmlake.service.MetadataService;
import com.henggao.cmlake.mapper.MetadataMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
* @author dell
* @description 针对表【metadata】的数据库操作Service实现
* @createDate 2023-11-01 17:14:57
*/
@Service
@AllArgsConstructor
public class MetadataServiceImpl extends ServiceImpl<MetadataMapper, Metadata>
    implements MetadataService{
    // 增
    @Override
    public int insertMetadata(Metadata metadata) {
        return baseMapper.insert( metadata );
    }

    // 改
    @Override
    public int updateMetadata(Metadata metadata) {
        return baseMapper.updateById( metadata );
    }

    // 删
    @Override
    public int deleteMetadata(Metadata metadata) {
        return baseMapper.deleteById( metadata.getId() );
    }

    // 查
    @Override
    public Metadata findMetadataById( String id ) {
        return baseMapper.selectById(id);
    }

}




