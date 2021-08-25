package pe.amadeo.mozart.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;

@Entity
@PrimaryKeyJoinColumn(name = "studentId")
@Table(name = "students")
@Getter
@Setter
public class Student extends Person implements Serializable {

    @OneToMany
    private Set<CoursePerGrade> courses;

    @OneToMany
    private Set<Guardian> guardians;

}
