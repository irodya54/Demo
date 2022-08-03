package AOP.Aspects;

//import AOP.Book;
import AOP.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAAspect {


    @Before("AOP.Aspects.MyPointcuts.allAddMethod()")
    private void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Сигнатура метода = " + signature);
        System.out.println("Метод = " + signature.getMethod());
        System.out.println("Возвращаемое значение = " + signature.getReturnType());
        System.out.println("Имя метода = " + signature.getName());
        if(signature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object objects : arguments) {
                if (objects instanceof Book) {
                    Book myBook = (Book) objects;
                    System.out.println("Информация о книге " + myBook.getName() + " " + myBook.getAuthor() + " " + myBook.getYearsPublication());
                } else if (objects instanceof String) {
                    System.out.println("Книгу в библиотеку добавляет " + objects);
                }

            }
        }





        System.out.println("beforeGetLoggingAdvice: логирование попаытки получить книги/журнала");
        System.out.println("____________________________________________");
    }



//    @Pointcut("execution(* AOP.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(public void AOP.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnFromUniLibrary() {}
//
//    @Before("allMethodsExceptReturnFromUniLibrary()")
//    public void BeforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("BeforeAllMethodsExceptReturnMagazineAdvice: writing Log #10");
//    }
//
//    @Before("returnMagazineFromUniLibrary()")
//    public void BeforeReturnMagazineAdvice(){
//        System.out.println("BeforeAllMethodsExceptReturnMagazineAdvice: writing Log #11");
//    }

//    @Pointcut("execution(* AOP.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(* AOP.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnReturnMethodsFromUniLibrary() {}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }




}
