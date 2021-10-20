package za.ac.mycput.studentmarks.entity.examination;

/* StudentMarks.java
 Test for the Examination entity

 Author: Siyamtanda Tonjeni (217107958)
 Date: 20 October 2021
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.mycput.studentmarks.factory.examination.ExaminationsFactory;

public class ExaminationsTest {

    private static Examinations examinations = ExaminationsFactory.createExaminations(217107958,
            "20/10/2021","ADP","Online","Practical test");

    @Test
    public void examTest(){
        Assertions.assertEquals(examinations, examinations);
        Assertions.assertSame(examinations,examinations);
    }

    @Test
    @Disabled
    public void disableTest(){
        Assertions.assertEquals(examinations, examinations);
    }

    @Test
    @Timeout(value = 1000)
    public void testTimeout(){
        Assertions.assertEquals(examinations, examinations);
    }
}