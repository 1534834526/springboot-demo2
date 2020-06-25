package com.baizhi.controller;

import com.baizhi.entity.Emp;
import com.baizhi.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author HGM
 */
@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpMapper empMapper;


    @RequestMapping("/emp")
    public List<Emp> test1(HttpServletRequest request) {
        List<Emp> persons = empMapper.selectAll();
        //  request.setAttribute("persons",persons);
        System.out.println("我是controller 我最大");
        System.out.println("我是controller 我最大2");
        return persons;
    }
}
