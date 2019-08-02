package com.jara;


public class student {
    private Long id;
    private String studentName;
    private String studentNumber;



    public student(String studentName, String studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;

    }

    private student() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentNunber='" + studentNumber + '\'' +
                '}';
    }




