package gr.projectFuruture.acmeFlix2.transfer.resource;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
public class GenreResource extends  BaseResource{
    @NotNull
    private String category;

    private List<MovieResource> movies;

    private List<SerieResource> series;
}
