package gr.projectFuruture.acmeFlix2.transfer.resource;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
public class ProfileResource extends BaseResource{
    @NotNull
    private String username;

    private AccountResource account;

    private List<ViewResource> view;

    private List<RatingResource> ratings;
}
