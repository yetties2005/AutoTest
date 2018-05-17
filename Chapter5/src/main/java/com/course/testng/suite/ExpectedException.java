package com.course.testng.suite;

import org.testng.annotations.Test;

public class ExpectedException {
    /**
     * 异常测试
     */
    //测试结果失败异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    //这是一个成功的异常测试
    @Test
    public void runTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }
}
