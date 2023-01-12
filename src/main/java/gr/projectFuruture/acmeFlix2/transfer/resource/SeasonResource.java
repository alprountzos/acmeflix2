package gr.projectFuruture.acmeFlix2.transfer.resource;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
public class SeasonResource extends BaseResource{
    private List<EpisodeResource> episodes;

    private SerieResource serie;

    @NotNull
    private Integer season;
}
