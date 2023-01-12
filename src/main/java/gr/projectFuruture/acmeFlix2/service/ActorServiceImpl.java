package gr.projectFuruture.acmeFlix2.service;


import gr.projectFuruture.acmeFlix2.domain.Actor;
import gr.projectFuruture.acmeFlix2.repository.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActorServiceImpl extends  BaseServiceImpl<Actor> implements ActorService {

    private final ActorRepository actorRepository;

    @Override
    JpaRepository<Actor, Long> getRepository() {
        return actorRepository;
    }
}