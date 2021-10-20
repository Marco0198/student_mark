package za.ac.mycput.studentmarks.factory.examination;

/* StudentMarks.java
 Test for the Examination Factory

 Author: Siyamtanda Tonjeni (217107958)
 Date: 20 October 2021
 */

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.mycput.studentmarks.entity.examination.Examinations;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExaminationFactoryTest {

    @Test
    void testNullValues() {

         Examinations examinations = ExaminationsFactory.createExaminations(217107958,
                "20/10/2021","ADP","Online","Practical test");

        System.out.println(examinations);
        String examName = UUID.randomUUID().toString();
        examinations = new Examinations.Builder()
                .setExamId(217107958)
                .setExamDate("20/10/2021")
                .setExamName("ADP")
                .setExamType("Online")
                .setExamDescription("Practical test")
                .build();
        System.out.println(examinations);

        assertNotNull(examinations);
    }

    @Test
    void testNotNullValues() {

        Examinations examinations = ExaminationsFactory.createExaminations(217107958,
                "20/10/2021","ADP","Online","Practical test");
        System.out.println(examinations);

        String examName = UUID.randomUUID().toString();
        Examinations examinations1 = new Examinations.Builder()
                .setExamId(217107958)
                .setExamDate("20/10/2021")
                .setExamName("ADT")
                .setExamType("Online")
                .setExamDescription("Written test")
                .build();
        System.out.println(examinations1);

        assertNotNull(examinations);
        assertNotNull(examinations1);
    }
    @Test
    public void object_quality()
    {
        String examName = "ADT";
        String examType = "Online";
        assertNotEquals(examName, examType);
    }

    @Test
    public void objectIdentity()
    {
        String examName = "ADP";
        String examType = "Online";
        assertEquals(examName, examType);
    }
    @Test
    @Timeout(2)
    public void timeoutPass()
    {
        // to test if method runs in 2 seconds
        int [] timeout = new int[3];
        for (int x = 0; x <timeout.length; x++)
        {
            System.out.println(timeout[x] + x);
        }

    }
    @Test
    @Disabled("Disabled")
    public void disablingTest()
    {
        assertEquals(3,2,3);
    }

}
