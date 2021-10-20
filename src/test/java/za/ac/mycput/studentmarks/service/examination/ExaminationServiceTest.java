package za.ac.mycput.studentmarks.service.examination;

import org.junit.jupiter.api.Test;
import za.ac.mycput.studentmarks.entity.examination.Examinations;
import za.ac.mycput.studentmarks.factory.examination.ExaminationsFactory;
import za.ac.mycput.studentmarks.service.examination.impl.ExaminationServiceImpl;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExaminationServiceTest {

    private static ExaminationServiceImpl examinationServiceImpl = new ExaminationServiceImpl();
    private static Examinations examinations = ExaminationsFactory.createExaminations(217107958,
            "20/10/2021","ADP","Online","Practical test");

    @Test
    void create(){
        Examinations created = examinationServiceImpl.create(examinations);
        assertEquals(examinations.getExamId(), created.getExamId());
        System.out.println("Created: "+created);
    }

    @Test
    void read(){
        Examinations read = examinationServiceImpl.read(examinations.getExamId());
        System.out.println("Read: "+read);
    }

    @Test
    void update(){
        Examinations update = new Examinations.Builder().copy(examinations).setExamName("ADT").build();
        System.out.println("Updated: " +update);
    }

    @Test
    void delete(){
        examinationServiceImpl.delete(examinations.getExamId());
        System.out.println("Deleted: "+examinations.getExamId()+"");
    }
}

