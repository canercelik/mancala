package com.canercelik.mancala.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MancalaLogger {

    private Logger logger = LoggerFactory.getLogger(MancalaLogger.class);

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Before("execution(* com.canercelik..*.*(..))")
    public void logBeforeMethod(@NotNull JoinPoint joinPoint) {
        logger.info("Executing \"{}\" method of  \"{}\".", joinPoint.getSignature().getName(), joinPoint.getTarget().getClass().getName());
    }

    @After("execution(* com.canercelik..*.*(..))")
    public void logAfterMethod(@NotNull JoinPoint joinPoint) {
        logger.info("Executed \"{}\" method of \"{}\" successfully.", joinPoint.getSignature().getName(), joinPoint.getTarget().getClass().getName());
    }
}