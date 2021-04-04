package uz.pdp.lesson_2task_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson_2task_2.entity.Detail;
import uz.pdp.lesson_2task_2.projection.CustomDetail;

@RepositoryRestResource(path = "detail", excerptProjection = CustomDetail.class)
public interface DetailRepository extends JpaRepository<Detail, Integer> {
}
