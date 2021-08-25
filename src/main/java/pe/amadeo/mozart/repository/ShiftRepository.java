package pe.amadeo.mozart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.amadeo.mozart.domain.Shift;

public interface ShiftRepository extends JpaRepository<Shift,Integer> {
}
