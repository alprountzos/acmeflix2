package gr.projectFuruture.acmeFlix2.repository;


import gr.projectFuruture.acmeFlix2.domain.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SerieRepository extends JpaRepository<Serie,Long> {
}
