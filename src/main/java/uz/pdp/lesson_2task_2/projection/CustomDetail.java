package uz.pdp.lesson_2task_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson_2task_2.entity.Detail;
import uz.pdp.lesson_2task_2.entity.Feature;
import uz.pdp.lesson_2task_2.entity.Product;

@Projection(types = Detail.class)
public interface CustomDetail {
    Integer getId();
    Product getProduct();
    Feature getFeature();
    String getValue();
}
