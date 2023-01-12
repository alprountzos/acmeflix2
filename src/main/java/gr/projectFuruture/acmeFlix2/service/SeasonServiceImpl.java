package gr.projectFuruture.acmeFlix2.service;


import gr.projectFuruture.acmeFlix2.domain.Season;
import gr.projectFuruture.acmeFlix2.repository.SeasonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SeasonServiceImpl extends BaseServiceImpl<Season> implements SeasonService{
    private final SeasonRepository seasonRepository;

    @Override
    JpaRepository<Season, Long> getRepository() {
        return seasonRepository;
    }
}
