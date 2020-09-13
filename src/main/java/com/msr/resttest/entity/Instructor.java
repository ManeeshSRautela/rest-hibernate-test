package com.msr.resttest.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;
import org.springframework.core.annotation.Order;

import javax.persistence.*;

@Entity
@Table(name = "instructor")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Instructor {
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

}
