package AOP.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class SecurityAspect {
    @Before("AOP.Aspects.MyPointcuts.allAddMethod()")
    private void beforeSecurityAdvice(JoinPoint joinPoint) {
        System.out.println("beforeSecurityAdvice: Проверка прав на получение книги/журнала ");
        System.out.println("____________________________________________");
    }
}
