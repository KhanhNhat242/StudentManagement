package com.example.testck.services;

import com.example.testck.models.Class;
import com.example.testck.repositories.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    public void createOrUpdate(Class c){
        classRepository.save(c);
    }

    public void delete(long id){
        classRepository.deleteById(id);
    }

    public Class findOne(long id){
        return classRepository.findById(id).get();
    }

    public List<Class> getAll(){
        return classRepository.findAll();
    }
}
