package curriculo.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "professional-experiences")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProfessionalExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String company;
    private List<String> skillsCompany;
    private int companyTime;
    @ManyToOne
    @JoinColumn(name = "profile_id", nullable = false)
    private Profile profile;
}
