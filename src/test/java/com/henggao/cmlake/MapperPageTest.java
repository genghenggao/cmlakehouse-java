package com.henggao.cmlake;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.henggao.cmlake.domain.Metadata;
import com.henggao.cmlake.mapper.MetadataMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

@MapperScan(
        basePackages = "com.henggao.cmlake.mapper"
)
@SpringBootTest
public class MapperPageTest {
    @Autowired
    private MetadataMapper metadataMapper;


    @Test
    public void selectPage(){
        LambdaQueryWrapper<Metadata> metadataLambdaQueryWrapper = Wrappers.lambdaQuery();
        metadataLambdaQueryWrapper.like(Metadata::getId , "654216cd2d2eb204ef2c3369");

        Page<Metadata> metadataPage = new Page<>(1 , 2);
        IPage<Metadata> metadataIPage = metadataMapper.selectPage(metadataPage , metadataLambdaQueryWrapper);
        System.out.println("总页数： "+metadataIPage.getPages());
        System.out.println("总记录数： "+metadataIPage.getTotal());
        metadataIPage.getRecords().forEach(System.out::println);
    }
}
