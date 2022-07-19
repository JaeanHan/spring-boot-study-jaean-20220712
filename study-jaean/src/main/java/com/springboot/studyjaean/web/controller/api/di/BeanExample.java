package com.springboot.studyjaean.web.controller.api.di;

import lombok.Getter;

@Getter
public class BeanExample {

    public BeanExample() {
        System.out.println("BeanExample 객체 생성");
    }

    public String isNull() {
        return "no";
    }

}
