package gr.projectFuruture.acmeFlix2.mapper;


import gr.projectFuruture.acmeFlix2.domain.Genre;
import gr.projectFuruture.acmeFlix2.transfer.resource.GenreResource;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GenreMapper extends BaseMapper<Genre, GenreResource>{
}
