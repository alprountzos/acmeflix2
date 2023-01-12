package gr.projectFuruture.acmeFlix2.mapper;


import gr.projectFuruture.acmeFlix2.domain.Serie;
import gr.projectFuruture.acmeFlix2.transfer.resource.SerieResource;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SerieMapper extends BaseMapper<Serie, SerieResource>{
}
