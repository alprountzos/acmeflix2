package gr.projectFuruture.acmeFlix2.service;

import gr.projectFuruture.acmeFlix2.domain.Account;
import gr.projectFuruture.acmeFlix2.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService{

    private final AccountRepository accountRepository;

    @Override
    public Account findByEmail(String email) {
        return null;
    }

    @Override
    JpaRepository<Account, Long> getRepository() {
        return accountRepository;
    }
}
