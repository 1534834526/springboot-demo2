package com.baizhi.mapper;

import com.baizhi.entity.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

public class SpringbootDemo2ApplicationTests {
@Autowired
private EmpMapper empMapper;

    @Test
    public void contextLoads() {


        List<Emp> emps = empMapper.selectAll();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }
}



