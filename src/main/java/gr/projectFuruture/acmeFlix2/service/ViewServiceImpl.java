package gr.projectFuruture.acmeFlix2.service;


import gr.projectFuruture.acmeFlix2.domain.View;
import gr.projectFuruture.acmeFlix2.repository.ViewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ViewServiceImpl extends BaseServiceImpl<View> implements ViewService{
    private final ViewRepository viewRepository;

    @Override
    JpaRepository<View, Long> getRepository() {
        return viewRepository;
    }
}
