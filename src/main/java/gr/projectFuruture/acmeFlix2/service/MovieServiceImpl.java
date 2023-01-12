package gr.projectFuruture.acmeFlix2.service;



import gr.projectFuruture.acmeFlix2.domain.Movie;
import gr.projectFuruture.acmeFlix2.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MovieServiceImpl extends BaseServiceImpl<Movie> implements MovieService {

    private final MovieRepository movieRepository;
    
    @Override
    JpaRepository<Movie, Long> getRepository() {
        return movieRepository;
    }
}
