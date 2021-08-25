package pe.amadeo.mozart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.amadeo.mozart.domain.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
