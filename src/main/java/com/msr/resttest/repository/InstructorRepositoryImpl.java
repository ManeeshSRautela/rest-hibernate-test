package com.msr.resttest.repository;

import com.msr.resttest.entity.Instructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.Optional;

@Slf4j
@Component
public class InstructorRepositoryImpl {
    @Autowired
    EntityManager entityManager;

    public <S extends Instructor> S save(S s) {
        log.info("Inside InstructorRepositoryImpl save ::");
        entityManager.persist(s);
        return entityManager.merge(s);
    }

}
