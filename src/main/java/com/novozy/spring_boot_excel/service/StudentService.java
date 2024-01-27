package com.novozy.spring_boot_excel.service;

import com.novozy.spring_boot_excel.entity.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);
    List<Student> getStudentList();
}
