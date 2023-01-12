package gr.projectFuruture.acmeFlix2.transfer.resource;


import gr.projectFuruture.acmeFlix2.domain.Season;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString(callSuper = true)
public class EpisodeResource extends BaseResource{
    @NotNull
    private Integer duration;

    private Season season;

    @NotNull
    private String epTitle;
}
