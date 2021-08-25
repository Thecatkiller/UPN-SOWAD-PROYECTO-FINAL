package pe.amadeo.mozart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.amadeo.mozart.domain.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
}
