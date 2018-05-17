package com.course.testng.multThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {

    int i = 1;

    //多线程
    @Test(invocationCount = 10 , threadPoolSize = 3)
    public void test(){
        System.out.println(i);
        System.out.printf("Thread ID : %s%n" , Thread.currentThread().getId());
        i++;
    }
}
