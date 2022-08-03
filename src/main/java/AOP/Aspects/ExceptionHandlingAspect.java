package AOP.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class ExceptionHandlingAspect {
    @Before("AOP.Aspects.MyPointcuts.allAddMethod()")
    public void beforeAddHandlingAdvice() {
        System.out.println("beforeGetHandlingAdvice: ловим и обрабатываем исключение при попытке получить книги/журнала");
        System.out.println("____________________________________________");
    }
}
