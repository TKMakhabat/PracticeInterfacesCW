package com.makhabatusen.applicant;

abstract class Student implements Applicant {
    private String course;

    public Student(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
