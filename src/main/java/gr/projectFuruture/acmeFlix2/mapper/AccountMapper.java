package gr.projectFuruture.acmeFlix2.mapper;

import gr.projectFuruture.acmeFlix2.domain.Account;
import gr.projectFuruture.acmeFlix2.transfer.resource.AccountResource;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper extends BaseMapper<Account, AccountResource>{
}
