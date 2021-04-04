package uz.pdp.lesson_2task_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson_2task_2.entity.CartInfo;

import java.util.List;

@Projection(types = CartInfo.class)
public interface CustomCartInfo {

    Integer getId();

    List<Integer> getProducts();

    Integer getCart();
    Integer getQuantity();
}
