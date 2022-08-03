package AOP.Aspects;

import AOP.University;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.*;

@Component
@Aspect
public class UniversaityLoggingAspect {

    private static Logger logger = Logger.getLogger("MyLog");
    private static FileHandler fh;

    static {
        try {
            // This block configure the logger with handler and formatter
            fh = new FileHandler("C:/Java/Log.txt", true);

            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            fh.setEncoding("utf-8");

            logger.addHandler(fh);

            logger.info("Пользователь: " + System.getProperty("user.name") + " My first log \n");
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
    }


    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        String text = "beforeGetStudentsLoggingAdvice: Логируем получение списка студентов"
                + " перед получением списка студентов \n";
        System.out.print(text);
        logger.info(text);
    }

    @AfterReturning("execution(* getStudents())")
    public void afterReturningGetStudentAdvice() {
        String text = "afterReturningGetStudentAdvice: Логируем получение списка студентов после"
                + " получения списка студентов \n";
        System.out.print(text);
        logger.info(text);
    }
}
