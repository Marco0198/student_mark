package za.ac.mycput.studentmarks.controller.examination;

/* StudentMarks.java
 Test for the Examination Controller

 Author: Siyamtanda Tonjeni (217107958)
 Date: 20 October 2021
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.mycput.studentmarks.entity.examination.Examinations;
import za.ac.mycput.studentmarks.factory.examination.ExaminationsFactory;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ExaminationsControllerTest {

    private static Examinations examinations = ExaminationsFactory.createExaminations(217107958,
            "20/10/2021","ADP","Online","Practical test");
    @Autowired
    private TestRestTemplate template;
    private final String BASE_URL = "http://localhost:8081/examination";

    @Test
    void a_create() {
        String url = BASE_URL + "/create";
        ResponseEntity<Examinations> postUserResponse = template.postForEntity(url, examinations, Examinations.class);
        assertNotNull(postUserResponse);
        assertNotNull(postUserResponse.getBody());
        assertEquals(postUserResponse.getStatusCode(), HttpStatus.OK);
        examinations = postUserResponse.getBody();
        System.out.println("Stored data" + examinations);
        assertEquals(examinations.getExamId(), postUserResponse.getBody().getExamId());
    }

    @Test
    void b_read() {
        String url = BASE_URL + "/read/" + examinations.getExamId();
        System.out.println("URL: " + url);
        ResponseEntity<Examinations> response = template.getForEntity(url, Examinations.class);
        assertEquals(examinations.getExamId(), Objects.requireNonNull(response.getBody()).getExamId());
    }

    @Test
    void c_update() {
        Examinations updated = new Examinations.Builder().copy(examinations).setExamDate("21/10/2021").build();
        String url = BASE_URL + "/update";
        System.out.println("URL: " + url);
        System.out.println("Post data: " + updated);
        ResponseEntity<Examinations> response = template.postForEntity(url, updated, Examinations.class);
        assertNotNull(response.getBody());
    }

    @Test
    void e_delete() {
        String url = BASE_URL + "/delete/" + examinations.getExamId();
        System.out.println("URL: " + url);
        template.delete(url);
    }

    @Test
    void d_getAll() {
        String url = BASE_URL + "/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = template.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("View All:");
        System.out.println(response);
        System.out.println(response.getBody());
    }
}
