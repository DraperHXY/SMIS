package com.yyh.dao;

import com.yyh.BaseTest;
import com.yyh.entity.Student;
import com.yyh.util.MD5Utils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentMapperTest extends BaseTest {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void insert() {
        Student student = new Student();
        student.setCreateAt(System.currentTimeMillis());
        student.setUpdateAt(System.currentTimeMillis());
        student.setAccount("zhangsan@yyh.com");
        student.setPassword(MD5Utils.encrypt("zhangsan"));

        studentMapper.insert(student);
    }

    @Test
    public void selectPasswordByAccount() {
        String password = studentMapper.selectPasswordByAccount("zhangsan@yyh.com");

        LOGGER.warn("password = {}", password);
    }

}