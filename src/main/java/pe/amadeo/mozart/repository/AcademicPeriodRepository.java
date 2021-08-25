package pe.amadeo.mozart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.amadeo.mozart.domain.AcademicPeriod;

public interface AcademicPeriodRepository extends JpaRepository<AcademicPeriod,Integer> {
}
