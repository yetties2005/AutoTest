package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name = " + name + " , age = " + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30},
        };

        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name , int age){
        System.out.println("test1方法 name = " + name + " , age = " + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name , int age){
        System.out.println("test2方法 name = " + name + " , age = " + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] o = null;
        if (method.getName().equals("test1")){
            o = new Object[][]{
                    {"zhangsan",10},
                    {"lisi",20},
            };
        }else if(method.getName().equals("test2")){
            o = new Object[][]{
                    {"wangwu",10},
                    {"zhaoaliu",20},
            };
        }

        return o;
    }
}
