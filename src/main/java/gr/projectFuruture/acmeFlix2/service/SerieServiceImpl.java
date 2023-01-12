package gr.projectFuruture.acmeFlix2.service;


import gr.projectFuruture.acmeFlix2.domain.Serie;
import gr.projectFuruture.acmeFlix2.repository.SerieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SerieServiceImpl extends BaseServiceImpl<Serie> implements SerieService{

    private final SerieRepository serieRepository;
    @Override
    JpaRepository<Serie, Long> getRepository() {
        return serieRepository;
    }
}
