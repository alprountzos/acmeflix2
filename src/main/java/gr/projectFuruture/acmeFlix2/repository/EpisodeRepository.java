package gr.projectFuruture.acmeFlix2.repository;

import gr.projectFuruture.acmeFlix2.domain.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodeRepository extends JpaRepository<Episode,Long> {
}
