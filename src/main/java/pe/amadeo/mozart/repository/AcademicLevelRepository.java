package pe.amadeo.mozart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.amadeo.mozart.domain.AcademicLevel;

public interface AcademicLevelRepository extends JpaRepository<AcademicLevel,Integer> {
}
