package pe.amadeo.mozart.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "courses_per_grade")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CoursePerGrade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private AcademicLevel academicLevel;

    @OneToOne
    private Course course;

    @OneToOne
    private Shift shift;

    private int year;

    @OneToOne
    private Teacher teacher;

}
