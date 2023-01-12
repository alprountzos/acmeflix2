package gr.projectFuruture.acmeFlix2.repository;


import gr.projectFuruture.acmeFlix2.domain.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre,Long> {
}
