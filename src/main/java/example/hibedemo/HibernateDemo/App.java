package example.hibedemo.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car("Toyota", "Allion", 10);
        Car car2 = new Car("Toyota","Premio", 5);
        
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Car.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction tr = session.beginTransaction();
        session.save(car);
        session.save(car2);
        car.setModel("Corolla");
        tr.commit();
    }
}
