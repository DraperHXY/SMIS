package com.yyh.service.impl;

import com.yyh.dao.StudentMapper;
import com.yyh.service.StudentSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentSerivce {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public boolean verify(String account, String expectPassword) {

        String actualPassword = studentMapper.selectPasswordByAccount(account);

        if (expectPassword.equals(actualPassword)){
            return true;
        } else {
            return false;
        }

    }
}
