package hibernateMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
    public static void main( String[] args ) throws Exception {
        System.out.println( "Hello World!" );
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        
            //Creating Student object
            Student student = new Student(105, "Pankaj", "Motipur");
            System.out.println(student);
            
            Session session = sessionFactory.openSession();
            
            Transaction transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
            session.close();
            
            
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        System.out.println("Successfull");
      }
}
