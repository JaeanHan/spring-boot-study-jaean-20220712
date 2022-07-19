package com.springboot.studyjaean.web.controller.api.di;

import org.springframework.stereotype.Repository;

@Repository
public class repoDaoImpl implements repoDao{

    @Override
    public boolean testReturn() {
        System.out.println("Connection 객체 만들고 SQL 쿼리문 실행하고. . . ");
        return true;
    }
}
