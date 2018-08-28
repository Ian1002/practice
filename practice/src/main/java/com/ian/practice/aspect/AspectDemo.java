package com.ian.practice.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Aspect
@Order(-99) // 控制多个Aspect的执行顺序，越小越先执行
@Component
public class AspectDemo {

	private final static Logger logger = LoggerFactory.getLogger(AspectDemo.class);

	@Before("@annotation(requestMapping)") // 拦截被TestAnnotation注解的方法；如果你需要拦截指定package指定规则名称的方法，可以使用表达式execution(...)
	public void beforeTest(JoinPoint point, RequestMapping requestMapping) throws Throwable {
		logger.debug("before RequestMapping:{}", requestMapping);

	}

	@After("@annotation(requestMapping)")
	public void afterTest(JoinPoint point, RequestMapping requestMapping) {
		logger.debug("after RequestMapping:{}", requestMapping);
	}

	@Around("@annotation(requestMapping)")
	public void aroundTest(JoinPoint point, RequestMapping requestMapping) {
		logger.debug("around RequestMapping:{}", requestMapping);
	}
}