package gr.projectFuruture.acmeFlix2.mapper;


import gr.projectFuruture.acmeFlix2.domain.Backup;
import gr.projectFuruture.acmeFlix2.transfer.resource.BackupResource;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BackupMapper extends BaseMapper<Backup, BackupResource>{
}
