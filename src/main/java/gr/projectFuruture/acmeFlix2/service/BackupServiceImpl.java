package gr.projectFuruture.acmeFlix2.service;


import gr.projectFuruture.acmeFlix2.domain.Backup;
import gr.projectFuruture.acmeFlix2.repository.BackUpRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BackupServiceImpl extends BaseServiceImpl<Backup> implements BackupService{
    private final BackUpRepository backupRepository;

    @Override
    JpaRepository<Backup, Long> getRepository() {
        return backupRepository;
    }
}
