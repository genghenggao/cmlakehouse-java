package com.henggao.cmlake.controller;

import com.henggao.cmlake.domain.Chunkdata;
import com.henggao.cmlake.service.ChunkdataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chunkdata")
public class ChunkdataController {
    @Autowired
    private ChunkdataService chunkdataService;

    // 增
    @PostMapping( value = "/insert")
    public Object insert( @RequestBody Chunkdata chunkdata ) {
        return chunkdataService.insertChunkdata( chunkdata );
    }

    // 改
    @PostMapping( value = "/update")
    public Object update( @RequestBody Chunkdata chunkdata ) {
        return chunkdataService.updateChunkdata( chunkdata );
    }

    // 删
    @PostMapping( value = "/delete")
    public Object delete( @RequestBody Chunkdata chunkdata ) {
        return chunkdataService.deleteChunkdata( chunkdata );
    }

    // 根据id查单条数据
    @GetMapping( value = "/getChunkdataById")
    public Object getChunkdataById( @RequestParam String id ) {
        return chunkdataService.findChunkdataById(id);
    }

    // 根据fileid查单条数据
    @GetMapping( value = "/getChunkdataByFileId")
    public Object getChunkdataByFileId( @RequestParam String fileId ) {
        return chunkdataService.findChunkdataByFileId(fileId);
    }

    // 查列表
    @GetMapping( value = "/getChunkdataByFileId1")
    public Object getChunkdataByFileId1( @RequestParam String fileId ) {
//        System.out.println(fileId);
        List<Chunkdata> chunkdata = chunkdataService.lambdaQuery()
                .like(Chunkdata::getFileId, fileId)
                .list();
//        chunkdata.forEach(System.out::println);
        return chunkdata;
    }
}
