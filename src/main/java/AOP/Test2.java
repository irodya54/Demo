package AOP;

import AOP.Aspects.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
        University univer = context.getBean("univer", University.class);

        univer.addStudent();
        List<Student> students = univer.getStudents();

        context.close();
    }
}
