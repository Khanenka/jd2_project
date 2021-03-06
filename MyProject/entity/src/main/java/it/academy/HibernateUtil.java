package it.academy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static SessionFactory sessionFactory;
    static {
        try {




            StandardServiceRegistry registry=  new StandardServiceRegistryBuilder()
                    .configure()
                    .build();
            sessionFactory=new MetadataSources(registry).buildMetadata().buildSessionFactory();


        }catch(Throwable e) {

        }
    }
    public static Session getSession(){
        return sessionFactory.openSession();
    }


}