package pe.amadeo.mozart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.amadeo.mozart.domain.Person;

public interface PersonRepository extends JpaRepository<Person,Integer> {
}
