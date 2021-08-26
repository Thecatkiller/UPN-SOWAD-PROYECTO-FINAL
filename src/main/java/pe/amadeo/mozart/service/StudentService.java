package pe.amadeo.mozart.service;

import pe.amadeo.mozart.domain.Student;

import java.util.List;

public interface StudentService {
    void save(Student student);
    Student findByDocument(String doc);
}
