package com.course.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Arthur
 * Date: 2018-05-23
 * Time: 上午11:08
 */
public class MyCookiesForGet {

    private String url ;
    private ResourceBundle bundle;
    //  用来存储cookies信息的变量
    private CookieStore store;
    @BeforeTest
    public void beforeTest(){
        //读取配置文件
        bundle = ResourceBundle.getBundle("application", Locale.CHINA);
        url = bundle.getString("test.url");
    }

    @Test
    public void testGetCookies() throws IOException {
        //从配置文件中拼接测试URL
        String result;
        String uri = bundle.getString("getCookies.uri");
        String testUrl = this.url + uri;

        //测试逻辑代码
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");

        System.out.println(result);

        //获取cookies信息
        store = client.getCookieStore();
        List<Cookie> cookieList = store.getCookies();

        for (Cookie cookie : cookieList){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("cookie name = " + name + " ; cookie value = " + value);
        }
    }

    @Test(dependsOnMethods = {"testGetCookies"})
    public void testGetWithCookkies() throws IOException {
        String uri = bundle.getString("test.get.with.cookies");
        String testUrl = this.url + uri;
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        //设置cookies信息
        client.setCookieStore(this.store);
        HttpResponse response = client.execute(get);
        System.out.println("Httpresponse = " + response);
        //获取响应的状态码
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("statusCode = " + statusCode);
        if(statusCode == 200){
            System.out.println("返回结果正确！");
        }
    }
}
