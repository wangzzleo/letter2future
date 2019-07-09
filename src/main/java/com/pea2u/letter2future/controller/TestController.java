package com.pea2u.letter2future.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzz
 * @date
 */
@Api(value = "test", description = "demo详情")
@RestController("/api")
public class TestController {

    @ApiOperation(value = "提交信件", httpMethod = "POST", consumes="application/x-www-form-urlencoded")
    @RequestMapping(value = "/test", method = RequestMethod.POST )
    public String getInput(@ApiParam("标题") String title, @ApiParam("内容") String content) {
        System.out.println(title + "\n" +content);
        return "success";
    }

}
