package ru.java.hibernate.tutorial.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "`groups`")
public class Groups implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gr_id;
    private String gr_name;
    @OneToMany(mappedBy = "group")
    private List<Students> students;

    public Groups() {}

    public Groups(int gr_id, String gr_name) {
        this.gr_id = gr_id;
        this.gr_name = gr_name;
        students = new ArrayList<Students>();
    }

    public void addStudent(Students student) {
        student.setGroup(this);
        students.add(student);
    }

    public void removeStudent(Students student) {
        students.remove(student);
    }

    public int getGr_id() {
        return gr_id;
    }

    public String getGr_name() {
        return gr_name;
    }

    public void setGr_name(String gr_name) {
        this.gr_name = gr_name;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Groups{" +
                "gr_id=" + gr_id +
                ", gr_name='" + gr_name + '\'' +
                '}';
    }
}
