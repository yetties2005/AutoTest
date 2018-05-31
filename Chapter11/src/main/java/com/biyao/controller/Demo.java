package com.biyao.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Arthur
 * Date: 2018-05-30
 * Time: 下午5:15
 */
@Log4j
@RestController
@Api(value = "v1",description = "这是我的第一个版本的Demo")
@RequestMapping("v1")
public class Demo {
    //先获取一个执行sql语句的对象
    @Autowired
    private SqlSessionTemplate template;

    @RequestMapping(value = "/getUserCount", method = RequestMethod.GET)
    @ApiOperation(value = "可以获取到用户数")
    public int getUserCount() {
        return template.selectOne("getUserCount");
    }
}
