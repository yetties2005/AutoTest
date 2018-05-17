package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void groupsOnMethod1(){
        System.out.println("这是服务端组的测试方法1");
    }

    @Test(groups = "server")
    public void groupsOnMethod2(){
        System.out.println("这是服务端组的测试方法2");
    }

    @Test(groups = "client")
    public void groupsOnMethod3(){
        System.out.println("这是客户端组的测试方法1");
    }

    @Test(groups = "client")
    public void groupsOnMethod4(){
        System.out.println("这是客户端组的测试方法2");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnMethod1(){
        System.out.println("这是服务端组运行之前运行的方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnMethod1(){
        System.out.println("这是服务端组运行之后运行的方法");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnMethod2(){
        System.out.println("这是客户端组运行之前运行的方法");
    }

    @AfterGroups("client")
    public void afterGroupsOnMethod2(){
        System.out.println("这是客户端组运行之后运行的方法");
    }
}
