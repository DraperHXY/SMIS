package com.yyh.entity;

import lombok.Data;

@Data
public class Student {

    private long id;

    private long createAt;

    private long updateAt;

    private String name;

    private String account;

    private String password;

}
