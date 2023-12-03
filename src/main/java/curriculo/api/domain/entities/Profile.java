package curriculo.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "profiles")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String email;
    private String city;
    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL)
    private List<AcademicExperience> academicExperiences;
    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL)
    private List<ProfessionalExperience> professionalExperiences;

}
