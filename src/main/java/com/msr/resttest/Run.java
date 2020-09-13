package com.msr.resttest;

import com.msr.resttest.entity.Instructor;
import com.msr.resttest.entity.InstructorDetail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class Run {

    public static InstructorDetail testGet(long id){
        log.info("Inside instructor detail get method");
        Map<String, Long> uriVar = new HashMap<>();
        uriVar.put("id", id);
        RestTemplate restTemplate = new RestTemplate();
        InstructorDetail instructorDetail = restTemplate.getForObject("http://localhost:8080/api/instructorDetails/{id}", InstructorDetail.class, uriVar);
        log.info(String.valueOf(instructorDetail));
        return instructorDetail;
    }

    public static void testPost(){
        RestTemplate restTemplate = new RestTemplate();
        log.info("Inside instructor post method");
//        InstructorDetail instructorDetail = testGet(21L);
        InstructorDetail instructorDetail = InstructorDetail.builder()
                .hobby("kuch bhi")
                .youtubeChannel("nahi hai")
                .build();


        log.info("instructor detail set");
        log.info("instructor set");

        instructorDetail = restTemplate.postForObject("http://localhost:8081/api/instructorDetails", instructorDetail, InstructorDetail.class);
        log.info("id : "+instructorDetail);


        Instructor instructor = Instructor.builder()
                .firstName("Maneesh")
                .lastName("Rautela")
                .email("man@giam.com")
                .instructorDetail(instructorDetail)
                .build();

        restTemplate.postForObject("http://localhost:8081/api/instructors", instructor, Instructor.class);

//        log.info(String.valueOf(instructor));
    }

    public static void main(String[] args) {
        testPost();
    }


}
