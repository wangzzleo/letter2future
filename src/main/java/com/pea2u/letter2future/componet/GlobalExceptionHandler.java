package com.pea2u.letter2future.componet;

import com.pea2u.letter2future.common.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author wangzz
 * @date 2019年7月10日15:05:51
 * 全局异常处理
 * /@ControllerAdvice注解是用来配置控制器通知的，我们可以配置过滤拦截具体一种或者多种类型的注解，
 * 添加annotations属性即可，在类的上方我们配置了@ControllerAdvice的annotations
 * 属性值为RestController.class，也就是只有添加了@RestController注解的控制器才会进入全局异常处理；
 * 因为我们全局返回的都是统一的Json格式的字符串，所以需要再类上配置@ResponseBody注解；
 */
@RestControllerAdvice
@ResponseBody
@Slf4j
public class GlobalExceptionHandler {

    /**
     * /
     * /@ExceptionHandler注解用来配置需要拦截的异常类型，默认是全局类型，可以通过value属性配置只对某个类型的异常起作用
     * /@ResponseStatus注解用于配置遇到该异常后返回数据时的StatusCode的值，我们这里默认使用值500；
     * @param e 异常
     * @return 同一处理结果
     */
    @ExceptionHandler
    @ResponseStatus
    public CommonResult<String> theWholeWorldHandler(Exception e) {
        log.error("系统异常{}", e.getMessage());
        if (e instanceof org.springframework.web.servlet.NoHandlerFoundException) {
            log.error("请求路径错误:{}" , e.getMessage());
            return CommonResult.urlNotFound();
        }
        return CommonResult.failed("系统异常!");
    }

}
