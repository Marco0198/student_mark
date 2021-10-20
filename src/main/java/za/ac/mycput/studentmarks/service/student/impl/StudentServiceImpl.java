package za.ac.mycput.studentmarks.service.student.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.mycput.studentmarks.entity.student.Student;
import za.ac.mycput.studentmarks.repository.student.StudentRepository;
import za.ac.mycput.studentmarks.service.student.StudentService;
import java.util.Set;
import java.util.stream.Collectors;
/*
 * author:marco Mulondayi
 * 219049505
 *
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;
    @Override
    public Student create(Student student){
        return this.repository.save(student);
    }

    @Override
    public Student read(Integer studentId) {
        return this.repository.findById(studentId).orElse(null);
    }

    @Override
    public Student update(Student studentId) {
        return create(studentId);
    }

    @Override
    public boolean delete(Integer studentId) {
        repository.deleteById(studentId);
        return !repository.existsById(studentId);
    }




    @Override
    public Set<Student> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }
}
