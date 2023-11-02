package com.henggao.cmlake.service;

import com.henggao.cmlake.domain.Metadata;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author dell
* @description 针对表【metadata】的数据库操作Service
* @createDate 2023-11-01 17:14:57
*/
public interface MetadataService extends IService<Metadata> {

    int insertMetadata( Metadata metadata );
    int updateMetadata( Metadata metadata );
    int deleteMetadata( Metadata metadata );
    Metadata findMetadataById( String id );

}
