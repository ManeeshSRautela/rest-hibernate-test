package com.msr.resttest.restcontroller;

import com.msr.resttest.entity.Instructor;
import com.msr.resttest.restservice.HttpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api")
public class HttpController {

    @Autowired
    HttpService httpService;

    @PostMapping("/manualInstructors")
    public void insertInstructorController(@RequestBody Instructor instructor){
        log.info("inside post insertInstructorController");
        httpService.saveInstructor(instructor);
    }
}
