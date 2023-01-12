package gr.projectFuruture.acmeFlix2.mapper;


import gr.projectFuruture.acmeFlix2.domain.Profile;
import gr.projectFuruture.acmeFlix2.transfer.resource.ProfileResource;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper extends BaseMapper<Profile, ProfileResource>{
}
