package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuit测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass这是在类运行前");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是在类运行后");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的！");
    }


    //最基本的注解
    @Test
    public void testCase1(){
        System.out.println("Test是测试文件1");
    }

    @Test
    public void testCase2(){
        System.out.println("Test是测试文件2");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod是在测试方法之后运行的！");
    }
}
