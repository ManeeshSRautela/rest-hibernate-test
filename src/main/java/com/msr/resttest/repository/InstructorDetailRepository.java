package com.msr.resttest.repository;

import com.msr.resttest.entity.InstructorDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorDetailRepository extends CrudRepository<InstructorDetail, Long> {

}
