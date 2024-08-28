package com.library.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
@Aspect
@Component
public class LoggingAspect {
	@Before("execution(* com.library.service.*.*(..))")
	public void logBefore() {
        System.out.println("Execution starts");
    }
	@After("execution(* com.library.service.*.*(..))")
    public void logAfter() {
        System.out.println("Execution ends");
    }
}
