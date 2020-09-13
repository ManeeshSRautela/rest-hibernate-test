package com.msr.resttest.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;
import org.springframework.core.annotation.Order;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "instructor")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Slf4j
public class Instructor implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id
    /*@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence-generator-instructor")
    @SequenceGenerator(
            name = "sequence-generator-instructor",
            sequenceName = "INSTRUCTOR_SEQ",
            allocationSize = 1)*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long instructorId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instructor_detail_id", nullable = false)
    public InstructorDetail instructorDetail;

    public InstructorDetail getInstructorDetail() {
        return this.instructorDetail;
    }

    public void setInstructorDetail(InstructorDetail instructorDetail) {
        if(instructorDetail != null) {
            log.info("Inside setInstructorDetail if block");
            this.instructorDetail = instructorDetail;
        }
    }

    public long getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(long instructorId) {
        this.instructorId = instructorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Instructor(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
