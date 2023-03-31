package tn.agena3000.cloud.kademproject.Aspects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@Component
@Aspect
@Slf4j

public class LoggingAspect {

    @Before("execution(* tn.agena3000.cloud.kademproject.services.*.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.debug("In method " + name + " : ");
    }
    @After("execution(* tn.agena3000.cloud.kademproject.services.*.*(..))")
    public void logMethodExit(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("out method " + name + " : ");
    }
}
