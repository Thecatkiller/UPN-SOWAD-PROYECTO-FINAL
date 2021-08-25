package pe.amadeo.mozart.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "students")
@Getter
@Setter
public class Student extends Person implements Serializable {



}
