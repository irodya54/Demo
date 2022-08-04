package hibernate_OneToOne.Entity;

import hibernate_OneToOne.Entity.Detail;
import hibernate_OneToOne.Entity.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        try (SessionFactory seasonFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
             Session session = seasonFactory.openSession()) {

//            Employee employee = new Employee("Radion", "Merzlyakov", "IT", 3000);
//            Detail detail = new Detail("Saint-Petersburg", "+79119983005", "ya,irodya@yandex.ru");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();
//
//            System.out.println("Done");
//
//
//        } catch (HibernateException e) {
//            throw new RuntimeException(e);
//        }
//            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 3500);
//            Detail detail = new Detail("Moscow", "+79119983006", "oleg@yandex.ru");
//            employee.setEmpDetail(detail);
//            session.save(employee);

            session.beginTransaction();
            Employee employee = session.get(Employee.class, 3);
            session.delete(employee);

            session.getTransaction().commit();

            System.out.println("Done");


        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }
}
