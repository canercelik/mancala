package com.canercelik.mancala.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MancalaLogger {

    private static final Logger mancalaLogger = LoggerFactory.getLogger(MancalaLogger.class);

    @Before("nonFinalPublicMethods()")
    public void logBeforeMethod(@NotNull JoinPoint joinPoint) {
        mancalaLogger.info("Executing \""+joinPoint.getSignature().getName()+"\" method of "+joinPoint.getTarget().getClass().getName()+".");
    }

    @After("nonFinalPublicMethods()")
    public void logAfterMethod(@NotNull JoinPoint joinPoint) {
        mancalaLogger.info("Executed \""+joinPoint.getSignature().getName()+"\" method of "+joinPoint.getTarget().getClass().getName()+" successfuly.");
    }

    @Pointcut("within(com.canercelik.*.*.*)")
    protected void nonFinalPublicMethods() {
    }
}
