package com.ff.aspectImpl.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class StudentAspect {

    @Before("@annotation(com.ff.aspectImpl.config.Logging)")
    public void beforeMethod(JoinPoint joinPoint){
        System.out.println("Executing Method:"+ joinPoint.getSignature().toShortString());
    }

    @After("@annotation(com.ff.aspectImpl.config.Logging)")
    public void afterMethod(JoinPoint joinPoint)
    {
        System.out.println("Execution of Method:"+joinPoint.getSignature().toShortString()+" completed");
    }

}
