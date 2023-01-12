package gr.projectFuruture.acmeFlix2.controller;


import gr.projectFuruture.acmeFlix2.domain.BaseModel;
import gr.projectFuruture.acmeFlix2.mapper.BaseMapper;
import gr.projectFuruture.acmeFlix2.service.BaseService;
import gr.projectFuruture.acmeFlix2.transfer.ApiResponse;
import gr.projectFuruture.acmeFlix2.transfer.resource.BaseResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

public abstract class BaseController <T extends BaseModel, R extends BaseResource> {
    abstract BaseService<T, Long> getBaseService();
    abstract BaseMapper<T, R> getBaseMapper();

    @GetMapping
    public ResponseEntity<ApiResponse<List<R>>> findAll() {
        List<R> resources = getBaseMapper().toResources(getBaseService().findAll());

        return ResponseEntity.ok(ApiResponse.<List<R>>builder().data(resources).build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<R>> find(@PathVariable Long id) {
        return ResponseEntity.ok(ApiResponse.<R>builder().data(getBaseMapper().toResource(getBaseService().find(id))).build());
    }

    @PostMapping
    public ResponseEntity<ApiResponse<R>> create(@Valid @RequestBody R resource) {
        return new ResponseEntity<>(
                ApiResponse.<R>builder()
                        .data(getBaseMapper().toResource(getBaseService().create(getBaseMapper().toDomain(resource))))
                        .build(),
                HttpStatus.CREATED
        );
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        getBaseService().deleteById(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@Valid @RequestBody R resource) {
        getBaseService().update(getBaseMapper().toDomain(resource));
    }
}

