package gr.projectFuruture.acmeFlix2.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import jakarta.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@SuperBuilder
public class Profile extends BaseModel{

    @Column(nullable = false)
    private String username;

    @ManyToOne
    private Account account;

    @OneToMany
    private List<View> view;

    @OneToMany
    private List<Rating> ratings;
}
