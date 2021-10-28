package ru.java.hibernate.tutorial.services;

import ru.java.hibernate.tutorial.dao.GroupDao;
import ru.java.hibernate.tutorial.entity.*;

import java.util.List;

public class GroupService {
    private final GroupDao groupDao = new GroupDao();

    public GroupService() {
    }

    public Groups findGroup(int id) {
        return groupDao.findById(id);
    }

    public void saveGroup(Groups group) {
        groupDao.save(group);
    }

    public void deleteGroup(Groups group) {
        groupDao.delete(group);
    }

    public void updateGroup(Groups group) {
        groupDao.update(group);
    }

    public List<Groups> findAllGroups() {
        return groupDao.findAll();
    }

    public Students findStudentById(int id) {
        return groupDao.findStudentById(id);
    }
}
