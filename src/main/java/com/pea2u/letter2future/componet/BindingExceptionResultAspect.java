package com.pea2u.letter2future.componet;

import com.pea2u.letter2future.common.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author wangzz
 * @date 2019年7月10日16:04:47
 * 异常结果统一处理
 */
@Component
@Aspect
@Slf4j
public class BindingExceptionResultAspect {

    @Pointcut("execution(public * com.pea2u.letter2future.controller.*.*(..))")
    public void BindingResult() {
    }

    @Around("BindingResult()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            return joinPoint.proceed();
        } catch (IllegalArgumentException ex) {
            log.error("参数校验异常:{}" , ex.getMessage());
            return CommonResult.validateFailed();
        }
    }

}
