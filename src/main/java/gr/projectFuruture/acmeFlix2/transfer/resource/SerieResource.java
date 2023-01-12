package gr.projectFuruture.acmeFlix2.transfer.resource;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
public class SerieResource extends ContentResource{
    private List<SeasonResource> seasons;

    private List<RatingResource> ratings;

    private List<ViewResource> views;
}
