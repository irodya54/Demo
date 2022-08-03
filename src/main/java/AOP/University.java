package AOP;

import AOP.Aspects.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component("univer")
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent() {
        Student student = new Student("Мерзляков Радион", 4, 5.0);
        Student student2 = new Student("Петр Петров", 2, 8.3);
        Student student3 = new Student("Елена Сидорова", 1, 9.1);
        students.add(student);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("ИНформация о студентах:");
        System.out.println(students);
        return students;
    }
}
