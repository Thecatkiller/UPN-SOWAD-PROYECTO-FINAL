package pe.amadeo.mozart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.amadeo.mozart.domain.Grades;

public interface GradesRepository extends JpaRepository<Grades,Integer> {
}
