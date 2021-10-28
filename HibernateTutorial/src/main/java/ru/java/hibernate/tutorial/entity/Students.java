package ru.java.hibernate.tutorial.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int st_id;
    private String st_name;
    private Date st_bdate;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "gr_id")
    private Groups group;

    public Students() {}

    public Students(int st_id, String st_name, Date st_bdate) {
        this.st_id = st_id;
        this.st_name = st_name;
        this.st_bdate = st_bdate;
    }

    public int getSt_id() {
        return st_id;
    }

    public void setSt_id(int st_id) {
        this.st_id = st_id;
    }

    public String getSt_name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public Date getSt_bdate() {
        return st_bdate;
    }

    public void setSt_bdate(Date st_bdate) {
        this.st_bdate = st_bdate;
    }

    public Groups getGroup() {
        return group;
    }

    public void setGroup(Groups group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Students{" +
                "st_id=" + st_id +
                ", st_name='" + st_name + '\'' +
                ", st_bdate=" + st_bdate +
                ", group=" + group.getGr_name() +
                '}';
    }
}
