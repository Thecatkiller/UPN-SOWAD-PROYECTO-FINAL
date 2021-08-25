package pe.amadeo.mozart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.amadeo.mozart.domain.CoursePerGrade;

public interface CoursePerGradeRepository extends JpaRepository<CoursePerGrade,Integer> {
}
