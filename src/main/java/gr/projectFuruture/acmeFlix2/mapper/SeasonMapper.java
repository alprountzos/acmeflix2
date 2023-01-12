package gr.projectFuruture.acmeFlix2.mapper;


import gr.projectFuruture.acmeFlix2.domain.Season;
import gr.projectFuruture.acmeFlix2.transfer.resource.SeasonResource;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SeasonMapper extends BaseMapper<Season, SeasonResource>{
}
