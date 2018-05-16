package com.course.testng;

import org.testng.annotations.Test;

public class lgnoreTest {

    @Test
    public void lgnoreTest1(){
        System.out.println("lgnoreTest1 执行");
    }

    @Test(enabled = false)
    public void lgnoreTest2(){
        System.out.println("lgnoreTest2 执行");
    }

    @Test(enabled = true)
    public void lgnoreTest3(){
        System.out.println("lgnoreTest3 执行");
    }
}
