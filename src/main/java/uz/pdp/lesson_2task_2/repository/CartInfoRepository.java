package uz.pdp.lesson_2task_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson_2task_2.entity.CartInfo;
import uz.pdp.lesson_2task_2.projection.CustomCart;

@RepositoryRestResource(path = "cartInfo", excerptProjection = CustomCart.class)
public interface CartInfoRepository extends JpaRepository<CartInfo, Integer> {
}
