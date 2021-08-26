package pe.amadeo.mozart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.amadeo.mozart.domain.Student;
import pe.amadeo.mozart.repository.StudentRepository;
import pe.amadeo.mozart.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findByDocument(String doc) {
        Student student = studentRepository.findByDocumentNumber(doc);
        return student;
    }

}
