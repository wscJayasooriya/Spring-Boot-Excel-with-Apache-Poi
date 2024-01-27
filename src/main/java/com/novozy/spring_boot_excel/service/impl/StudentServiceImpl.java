package com.novozy.spring_boot_excel.service.impl;

import com.novozy.spring_boot_excel.entity.Student;
import com.novozy.spring_boot_excel.repository.StudentRepository;
import com.novozy.spring_boot_excel.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }
}
