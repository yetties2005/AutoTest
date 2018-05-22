package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 3000) //毫秒值  3000 == 3秒
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 3000)
    public void testFile() throws InterruptedException {
        Thread.sleep(4000);
    }
}
