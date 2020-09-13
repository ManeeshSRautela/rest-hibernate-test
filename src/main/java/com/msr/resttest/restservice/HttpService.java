package com.msr.resttest.restservice;

import com.msr.resttest.dao.HttpDao;
import com.msr.resttest.entity.Instructor;
import com.msr.resttest.repository.InstructorRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class HttpService {

    @Autowired
//    HttpDao httpDao;
    InstructorRepositoryImpl instructorRepository;

    @Transactional
    public void saveInstructor(Instructor instructor) {
        instructorRepository.save(instructor);
    }
}
