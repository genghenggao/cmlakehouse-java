package com.henggao.cmlake;
import com.henggao.cmlake.domain.Chunkdata;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.henggao.cmlake.mapper.ChunkdataMapper;

import java.util.List;

@MapperScan(
        basePackages = "com.henggao.cmlake.mapper"
)
@SpringBootTest
public class CmlakeTest {
    @Autowired
    private ChunkdataMapper ChunkdataMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Chunkdata> ChunkdataList = ChunkdataMapper.selectList(null);
//        Assert.isTrue(5 == ChunkdataList.size(), "");
        ChunkdataList.forEach(System.out::println);
    }
}
