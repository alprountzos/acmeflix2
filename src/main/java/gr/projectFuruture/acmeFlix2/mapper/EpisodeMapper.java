package gr.projectFuruture.acmeFlix2.mapper;


import gr.projectFuruture.acmeFlix2.domain.Episode;
import gr.projectFuruture.acmeFlix2.transfer.resource.EpisodeResource;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EpisodeMapper extends BaseMapper<Episode, EpisodeResource>{
}
