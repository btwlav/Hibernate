package ru.java.hibernate.tutorial;

import org.hibernate.Session;
import ru.java.hibernate.tutorial.entity.*;
import ru.java.hibernate.tutorial.services.GroupService;

import java.util.Date;

public class Start {
    public static void main(String[] args) {
//        HibernateUtil.getSessionFactory().openSession();
        GroupService groupService = new GroupService();
        System.out.println(groupService.findGroup(2));
//        System.out.println(groupService.findStudentById(3));
//        Groups group = new Groups(4, "test");
//        groupService.saveGroup(group);
//        Students student = new Students(5,"Kakoi-to 4el", new Date(new Date().getTime()));
//        student.setGroup(group);
//        group.addStudent(student);
//        groupService.updateGroup(group);


        //output groups
        for (Groups groups: new GroupService().findAllGroups()) {
            System.out.println("group=" + groups.getGr_name());
        }

    }
}
