package hibernate_OneToOne.Entity;

import hibernate_OneToOne.Entity.Detail;
import hibernate_OneToOne.Entity.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {
    public static void main(String[] args) {
        try (SessionFactory seasonFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
             Session session = seasonFactory.openSession()) {
//
//            Employee employee = new Employee("Nikolay", "Ivenov", "HR", 6000);
////            Detail detail = new Detail("Vorkuta", "+79328561124", "kolya@yandex.ru");
//
//            employee.setEmpDetail(detail);
//            detail.setDetEmployee(employee);

            session.beginTransaction();
            Detail detail = session.get(Detail.class, 3);
//            session.save(detail);
            System.out.println(detail.getDetEmployee());
            session.getTransaction().commit();

            System.out.println("Done");


        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }
}
