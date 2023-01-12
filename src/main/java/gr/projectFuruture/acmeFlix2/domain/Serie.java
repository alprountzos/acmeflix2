package gr.projectFuruture.acmeFlix2.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import jakarta.persistence.*;
import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@Entity
public class Serie extends Content{

    @OneToMany(mappedBy = "serie")
    private List<Season> seasons;

    @OneToMany(mappedBy = "serie")
    private List<Rating> ratings;

    @OneToMany(mappedBy = "serie")
    private List<View> views;
}
