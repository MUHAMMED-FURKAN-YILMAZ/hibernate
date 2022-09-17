package Deneme1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class sessionFactoryMethod {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure("hibernate.cfg.xml")
                    .addAnnotatedClass(developers.class).addAnnotatedClass(Language.class).buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("SessionFactory oluşturulamadı." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
}
