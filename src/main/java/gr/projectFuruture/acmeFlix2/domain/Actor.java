package gr.projectFuruture.acmeFlix2.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


import java.util.List;
@Data
@SuperBuilder
@NoArgsConstructor
@Entity
public class Actor extends BaseModel{

    @Column(length = 50, nullable = false)
    private String fullname;

    @ManyToMany(mappedBy = "actors")
    private List<Movie> movies;

    @ManyToMany(mappedBy = "actors")
    private List<Serie> series;
}
