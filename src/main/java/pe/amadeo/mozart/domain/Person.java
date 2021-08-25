package pe.amadeo.mozart.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "persons")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 80)
    private String name;

    @Column(length = 80)
    private String lastname;

    @Column(length = 80)
    private String mothersLastName;

    @OneToOne
    private DocumentType documentType;

    @Column(length = 15)
    private String documentNumber;

    @OneToOne
    private User user;

}
