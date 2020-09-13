package com.msr.resttest.dao;

import com.msr.resttest.entity.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class HttpDao {
    @Autowired
    private EntityManager entityManager;

    public void save(Instructor instructor) {
        entityManager.merge(instructor);
    }
}
