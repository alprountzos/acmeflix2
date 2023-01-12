package gr.projectFuruture.acmeFlix2.repository;


import gr.projectFuruture.acmeFlix2.domain.Backup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BackUpRepository extends JpaRepository<Backup,Long> {
}
