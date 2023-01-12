package gr.projectFuruture.acmeFlix2.repository;


import gr.projectFuruture.acmeFlix2.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository extends JpaRepository<Account,Long>{
}
