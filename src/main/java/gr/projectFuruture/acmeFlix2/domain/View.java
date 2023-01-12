package gr.projectFuruture.acmeFlix2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class View extends BaseModel{

    @Column(nullable = false)
    private double viewedDuration;

    private LocalDateTime date;

    @ManyToOne
    private Profile profile;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Serie serie;

}