package gr.projectFuruture.acmeFlix2.mapper;


import gr.projectFuruture.acmeFlix2.domain.Actor;
import gr.projectFuruture.acmeFlix2.transfer.resource.ActorResource;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActorMapper extends BaseMapper<Actor, ActorResource>{
}
