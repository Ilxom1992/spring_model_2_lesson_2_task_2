package uz.pdp.lesson_2task_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson_2task_2.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {

    Integer getId();

    String getName();

    String getDescription();

    Integer getParentCategory();

    Integer getAttachment();


}
