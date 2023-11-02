package com.henggao.cmlake.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.henggao.cmlake.domain.Chunkdata;
import com.henggao.cmlake.domain.Metadata;
import com.henggao.cmlake.mapper.ChunkdataMapper;
import com.henggao.cmlake.mapper.MetadataMapper;
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
    @PostMapping(value = "/insert")
    public Object insert(@RequestBody Chunkdata chunkdata) {
        return chunkdataService.insertChunkdata(chunkdata);
    }

    // 改
    @PostMapping(value = "/update")
    public Object update(@RequestBody Chunkdata chunkdata) {
        return chunkdataService.updateChunkdata(chunkdata);
    }

    // 删
    @PostMapping(value = "/delete")
    public Object delete(@RequestBody Chunkdata chunkdata) {
        return chunkdataService.deleteChunkdata(chunkdata);
    }

    // 根据id查单条数据
    @GetMapping(value = "/getChunkdataById")
    public Object getChunkdataById(@RequestParam String id) {
        return chunkdataService.findChunkdataById(id);
    }

    // 根据fileid查单条数据
    @GetMapping(value = "/getChunkdataByFileId")
    public Object getChunkdataByFileId(@RequestParam String fileId) {
        return chunkdataService.findChunkdataByFileId(fileId);
    }

    // 查列表
    @GetMapping(value = "/getListByFileId")
    public Object getListByFileId(@RequestParam String fileId) {
//        System.out.println(fileId);
        List<Chunkdata> chunkdata = chunkdataService.lambdaQuery()
                .like(Chunkdata::getFileId, fileId)
                .list();
//        chunkdata.forEach(System.out::println);
        return chunkdata;
    }


    @Autowired
    private ChunkdataMapper chunkdataMapper;

    //分页查询
    @GetMapping(value = "/getPageByFileId")
    public Object getPageByFileId(@RequestParam String fileId) {
        LambdaQueryWrapper<Chunkdata> chunkdataLambdaQueryWrapper = Wrappers.lambdaQuery();
        chunkdataLambdaQueryWrapper.like(Chunkdata::getFileId, fileId);
        Page<Chunkdata> chunkdataPage = new Page<>(1, 10);
        IPage<Chunkdata> chunkdataIPage = chunkdataMapper.selectPage(chunkdataPage, chunkdataLambdaQueryWrapper);
//        System.out.println("总页数： " + chunkdataIPage.getPages());
//        System.out.println("总记录数： " + chunkdataIPage.getTotal());
//        chunkdataIPage.getRecords().forEach(System.out::println);
        return chunkdataIPage.getRecords();
    }

}
