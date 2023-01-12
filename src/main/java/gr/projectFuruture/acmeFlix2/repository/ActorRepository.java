package gr.projectFuruture.acmeFlix2.repository;


import gr.projectFuruture.acmeFlix2.domain.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor,Long> {
}
