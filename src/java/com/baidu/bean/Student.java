package com.baidu.bean;

import java.io.Serializable;

/**
 * Created by dllo on 17/11/27.
 */
public class Student implements Serializable{

    private Integer id;
    private String studentName;
    private String password;

    public Student() {
    }

    public Student(String studentName, String password) {
        this.studentName = studentName;
        this.password = password;
    }

    public Student(Integer id, String studentName, String password) {
        this.id = id;
        this.studentName = studentName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
