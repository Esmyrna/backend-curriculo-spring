package curriculo.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "academic-experiences")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AcademicExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String highSchool;
    private int highSchoolCompletion;
    private String university;
    private Long  universityCompletion;
    @ManyToOne
    @JoinColumn(name = "profile_id", nullable = false)
    private Profile profile;
}
