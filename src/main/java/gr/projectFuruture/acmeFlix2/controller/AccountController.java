package gr.projectFuruture.acmeFlix2.controller;


import gr.projectFuruture.acmeFlix2.domain.Account;
import gr.projectFuruture.acmeFlix2.mapper.BaseMapper;
import gr.projectFuruture.acmeFlix2.service.BaseService;
import gr.projectFuruture.acmeFlix2.transfer.resource.AccountResource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("categories")
public class AccountController extends BaseController<Account, AccountResource> {
    @Override
    BaseService<Account, Long> getBaseService() {
        return null;
    }

    @Override
    BaseMapper<Account, AccountResource> getBaseMapper() {
        return null;
    }
}
