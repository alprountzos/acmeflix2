package gr.projectFuruture.acmeFlix2.service;


import gr.projectFuruture.acmeFlix2.domain.Profile;
import gr.projectFuruture.acmeFlix2.repository.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl extends BaseServiceImpl<Profile> implements ProfileService{
    private final ProfileRepository profileRepository;

    @Override
    JpaRepository<Profile, Long> getRepository() {
        return profileRepository;
    }
}
