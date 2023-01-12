package gr.projectFuruture.acmeFlix2.mapper;


import gr.projectFuruture.acmeFlix2.domain.View;
import gr.projectFuruture.acmeFlix2.transfer.resource.ViewResource;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ViewMapper extends BaseMapper<View, ViewResource>{
}
