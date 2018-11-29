package com.yyh.dao;

import com.yyh.entity.Student;

public interface StudentMapper {

    void insert(Student student);

    String selectPasswordByAccount(String account);

}
