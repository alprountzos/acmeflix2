package gr.projectFuruture.acmeFlix2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Movie extends Content{

    @Column(nullable = false)
    private int duration;

    @OneToMany(mappedBy = "movie")
    private List<Rating> ratings;

    @OneToMany(mappedBy = "movie")
    private List<View> views;
}
