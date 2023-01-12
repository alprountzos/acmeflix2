package gr.projectFuruture.acmeFlix2.service;


import gr.projectFuruture.acmeFlix2.domain.Episode;
import gr.projectFuruture.acmeFlix2.repository.EpisodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EpisodeServiceImpl extends BaseServiceImpl<Episode> implements EpisodeService{
    private final EpisodeRepository episodeRepository;

    @Override
    JpaRepository<Episode, Long> getRepository() {
        return episodeRepository;
    }
}
