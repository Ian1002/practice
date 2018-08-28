package com.ian.practice.aspect;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class HttpAspect {
 
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);
 
    @Pointcut(value = "execution(public * com.ian.learning.controller.HelloController.*(..))")
    public void p(){}
 
    @Before("p()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
 
        //URL
        logger.warn("URL={}",request.getRequestURL());
 
        //Method
        logger.warn("Method={}",request.getMethod());
 
        //IP
        logger.warn("IP={}",request.getRemoteAddr());
 
        //Class.Method
        logger.warn("CLass.Method={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName()+"()");
 
        //Args
        logger.warn("Args={}",joinPoint.getArgs());
 
        //...其余操作
 
    }
 
    @After("p()")
    public void doAfter(){
        logger.warn("HttpAspect doAfter Running : "+new Date().getTime());
    }
 
}