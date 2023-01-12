package gr.projectFuruture.acmeFlix2.domain;

import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Data
public class Season extends BaseModel{

    @OneToMany(mappedBy = "season")
    private List<Episode> episodes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "serie_id")
    private Serie serie;

    @Column(nullable = false)
    private Integer season;

}
