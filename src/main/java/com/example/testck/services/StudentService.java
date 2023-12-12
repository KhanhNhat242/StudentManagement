package com.example.testck.services;

import com.example.testck.models.Student;
import com.example.testck.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void createOrUpdate(Student s){
        studentRepository.save(s);
    }

    public void delete(long id){
        studentRepository.deleteById(id);
    }

    public Student findOne(long id){
        return studentRepository.findById(id).get();
    }

    public List<Student> getAll(){
        return studentRepository.findAll();
    }
}
