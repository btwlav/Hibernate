package ru.java.hibernate.tutorial.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.java.hibernate.tutorial.HibernateUtil;
import ru.java.hibernate.tutorial.entity.*;

import java.util.List;

public class GroupDao {
    public Groups findById(int id) {
        return HibernateUtil.getSessionFactory().openSession().get(Groups.class, id);
    }

    public void save(Groups group) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(group);
        tx1.commit();
        session.close();
    }

    public void update(Groups group) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(group);
        tx1.commit();
        session.close();
    }

    public void delete(Groups group) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(group);
        tx1.commit();
        session.close();
    }

    public Students findStudentById(int id) {
        return HibernateUtil.getSessionFactory().openSession().get(Students.class, id);
    }

    public List<Groups> findAll() {
        return (List<Groups>) HibernateUtil.getSessionFactory().openSession().createQuery("From Groups").list();
    }
}
