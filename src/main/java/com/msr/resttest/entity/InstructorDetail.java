package com.msr.resttest.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "instructor_detail")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstructorDetail implements Serializable {

    private static final long serialVersionUID = 1l;
    @Id
    /*@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence-generator-instructor-det")
    @SequenceGenerator(
            name = "sequence-generator-instructor-det",
            sequenceName = "instructor_dtl_seq",
            allocationSize = 1)*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long instructorDetailId;
    @Column
    private String youtubeChannel;
    @Column
    private String hobby;

//    @OneToOne(mappedBy = "instructorDetail", cascade = CascadeType.ALL)
//    @JsonBackReference

    public String getYoutubeChannel() {
        return youtubeChannel;
    }

    public void setYoutubeChannel(String youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public InstructorDetail(String youtubeChannel, String hobby) {
        this.youtubeChannel = youtubeChannel;
        this.hobby = hobby;
    }
}
