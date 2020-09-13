package com.msr.resttest;

/*
import com.fasterxml.jackson.databind.ObjectMapper;
import com.msr.resttest.entity.InstructorDetail;
import com.msr.resttest.repository.InstructorDetailRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

@SpringBootTest
@RunWith(SpringRunner.class)
@RestClientTest(InstructorDetailRepository.class)
public class RestTestApplicationTests {

    @Autowired
    private InstructorDetailRepository instructorDetailRepository;

    @Autowired
    private MockRestServiceServer mockRestServiceServer;

    @Autowired
    ObjectMapper objectMapper;

    @Before
    public void setup() throws Exception{
        InstructorDetail instructorDetail = new InstructorDetail(2, "eu, eleifend","tempor");
                String instructorDetailStr = objectMapper.writeValueAsString(instructorDetail);

        mockRestServiceServer.expect(requestTo("http://localhost:8080/instructorDetails/2"))
                .andRespond(withSuccess(instructorDetailStr, MediaType.APPLICATION_JSON));
    }

    @Test
    public void testInstructorDetail(){
        InstructorDetail instructorDetail = this.instructorDetailRepository.findById(2L).get();
        assertThat(instructorDetail.getYoutubeChannel()).isEqualTo("eu, eleifend");
        assertThat(instructorDetail.getHobby()).isEqualTo("tempor");
    }

}
*/