package gr.projectFuruture.acmeFlix2.service;


import gr.projectFuruture.acmeFlix2.domain.Account;

public interface AccountService extends BaseService<Account,Long>{
    Account findByEmail(String email);
}
