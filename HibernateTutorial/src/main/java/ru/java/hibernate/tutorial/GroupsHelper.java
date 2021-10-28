package ru.java.hibernate.tutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.java.hibernate.tutorial.entity.Groups;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class GroupsHelper {
    private final SessionFactory sessionFactory;

    public GroupsHelper() { sessionFactory = HibernateUtil.getSessionFactory();}

    public List<Groups> getGroupsList() {
        Session session = sessionFactory.openSession();

        session.get(Groups.class, 1);

        CriteriaBuilder cb = session.getCriteriaBuilder();

        CriteriaQuery<Groups> cq = cb.createQuery(Groups.class);

        Root<Groups> root = cq.from(Groups.class);

        cq.select(root);

        Query query = session.createQuery(cq);

        List<Groups> groupsList = query.getResultList();

        session.close();

        return groupsList;
    }

    public Groups getGroup(String name) { return null;}
}
