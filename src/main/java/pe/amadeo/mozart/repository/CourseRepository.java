package pe.amadeo.mozart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.amadeo.mozart.domain.Course;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
