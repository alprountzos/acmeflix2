package gr.projectFuruture.acmeFlix2.transfer.resource;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
public class ContentResource extends BaseResource {

    @NotNull
    private String title;

    @NotNull
    private int yearPublished;

    @NotNull
    private int ageRestriction;

    private List<GenreResource> genres;

    private List<ActorResource> actors;
}
