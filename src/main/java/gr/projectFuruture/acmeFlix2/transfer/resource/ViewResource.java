package gr.projectFuruture.acmeFlix2.transfer.resource;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString(callSuper = true)
public class ViewResource extends BaseResource{
    @NotNull
    private double viewedDuration;

    private LocalDateTime date;

    private ProfileResource profile;

    private MovieResource movie;

    private SerieResource serie;
}
