package gr.projectFuruture.acmeFlix2.mapper;


import gr.projectFuruture.acmeFlix2.domain.Rating;
import gr.projectFuruture.acmeFlix2.transfer.resource.RatingResource;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RatingMapper extends BaseMapper<Rating, RatingResource>{
}
