package org.rob.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.rob.entity.Customer;

/**
 * Created by robendiane on 21-12-17.
 */
public class SessionPersistExample {
    public static void main(String[] args) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.getTransaction();
            transaction.begin();

            Customer customer = new Customer();
            customer.setId(2l);
            customer.setName("JoeJoe");
            session.persist(customer);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        HibernateUtil.shutdown();
    }
}
