package gr.projectFuruture.acmeFlix2.mapper;


import gr.projectFuruture.acmeFlix2.domain.Movie;
import gr.projectFuruture.acmeFlix2.transfer.resource.MovieResource;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MovieMapper extends BaseMapper<Movie, MovieResource>{
}
