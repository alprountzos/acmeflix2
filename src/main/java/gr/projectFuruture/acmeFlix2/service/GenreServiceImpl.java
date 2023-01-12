package gr.projectFuruture.acmeFlix2.service;


import gr.projectFuruture.acmeFlix2.domain.Genre;
import gr.projectFuruture.acmeFlix2.repository.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl extends BaseServiceImpl<Genre> implements GenreService{
    private final GenreRepository genreRepository;

    @Override
    JpaRepository<Genre, Long> getRepository() {
        return genreRepository;
    }
}
