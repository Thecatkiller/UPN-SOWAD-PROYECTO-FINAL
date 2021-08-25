package pe.amadeo.mozart.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@PrimaryKeyJoinColumn(name = "guardianId")
@Table(name = "guardians")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Guardian extends Person implements Serializable {

    private String phoneNumber;

    private String email;

    private String address;

}
