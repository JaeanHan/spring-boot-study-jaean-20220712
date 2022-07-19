package com.springboot.studyjaean.web.controller.api.di;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class TestConfigTest {

    @Test
    void beanExampleTest() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);

        BeanExample beanExample = ac.getBean(BeanExample.class);

        Assertions.assertEquals("no", beanExample.isNull());
    }

    @Test
    void beanSingletonTest() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);

        BeanExample bean1 = ac.getBean(BeanExample.class);
        BeanExample bean2 = ac.getBean(BeanExample.class);

        System.out.println(bean1);
        System.out.println(bean2);

        Assertions.assertEquals(bean1, bean2);
    }

//    @Test
//    public void sameClassTest() {
//
//        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
//
//        BeanExample bean1 = ac.getBean("b1", BeanExample.class);
//        BeanExample bean2 = ac.getBean("b2", BeanExample.class);
//
//        //. . .
//    }
}