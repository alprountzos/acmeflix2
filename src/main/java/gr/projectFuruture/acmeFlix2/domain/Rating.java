package gr.projectFuruture.acmeFlix2.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import jakarta.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
public class Rating extends BaseModel{

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Serie serie;
    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @Min(0)
    @Max(10)
    @Column(nullable = false)
    private int rate;
    private String comment;
}
