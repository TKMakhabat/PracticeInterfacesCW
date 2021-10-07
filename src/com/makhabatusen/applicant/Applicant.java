package com.makhabatusen.applicant;

public interface Applicant {
    default void getUniversity() {
        System.out.println("Studies at INAI");
    }
}
