package uz.pdp.lesson_2task_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson_2task_2.entity.Blog;

@Projection(types = Blog.class)
public interface CustomBlog {
    Integer getId();

    String getBody();

    String getTitle();

    Integer getPhoto();
}
