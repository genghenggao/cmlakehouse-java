package com.henggao.cmlake.controller;

import com.henggao.cmlake.domain.Metadata;
import com.henggao.cmlake.service.MetadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metadata")
public class MetadataController {
    @Autowired
    private MetadataService metadataService;

    // 增
    @PostMapping( value = "/insert")
    public Object insert( @RequestBody Metadata metadata ) {
        return metadataService.insertMetadata( metadata );
    }

    // 改
    @PostMapping( value = "/update")
    public Object update( @RequestBody Metadata metadata ) {
        return metadataService.updateMetadata( metadata );
    }

    // 删
    @PostMapping( value = "/delete")
    public Object delete( @RequestBody Metadata metadata ) {
        return metadataService.deleteMetadata( metadata );
    }

    // 查
    @GetMapping( value = "/getMetadataById")
    public Object getMetadataById( @RequestParam String id ) {
        return metadataService.findMetadataById(id);
    }
}
