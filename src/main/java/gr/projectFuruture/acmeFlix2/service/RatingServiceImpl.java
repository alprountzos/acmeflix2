package gr.projectFuruture.acmeFlix2.service;


import gr.projectFuruture.acmeFlix2.domain.Rating;
import gr.projectFuruture.acmeFlix2.repository.RatingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RatingServiceImpl extends BaseServiceImpl<Rating> implements RatingService{
    private final RatingRepository ratingRepository;

    @Override
    JpaRepository<Rating, Long> getRepository() {
        return ratingRepository;
    }
}
