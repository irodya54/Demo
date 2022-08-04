package OneToMany;

import OneToMany.Entity.Department;
import OneToMany.Entity.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.OneToMany;

public class Test2 {
    public static void main(String[] args) {
        try (SessionFactory seasonFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
             Session session = seasonFactory.openSession()) {
//
//            Department department = new Department("IT", 300, 1200);
//            Employee emp1 = new Employee("Radion", "Merzlyakov", 800);
//            Employee emp2 = new Employee("Elena", "Smirnova", 1000);
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            session.beginTransaction();
//
//            session.save(department);
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Done");

            session.beginTransaction();

            Employee employee = session.get(Employee.class, 4);
            session.delete(employee);
            session.getTransaction().commit();
            System.out.println("Done");


        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }
}
