package com.example.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.mybatisplus.POJO.dept;
import com.example.mybatisplus.dao.studao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusApplicationTests {
    @Autowired
    private studao  studao;

    @Test
    void contextLoads() {
        List<dept> stus = studao.selectList(null);
        System.out.println(stus);
    }

    @Test
    void testbycheck() {
        LambdaQueryWrapper<dept> query = new LambdaQueryWrapper<dept>();
        query.gt(dept::getId, 1);
        List<dept> depts = studao.selectList(query);
        System.out.println(depts);

    }
}
