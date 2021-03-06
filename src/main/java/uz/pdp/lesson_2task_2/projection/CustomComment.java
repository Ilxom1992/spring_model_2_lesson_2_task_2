package uz.pdp.lesson_2task_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson_2task_2.entity.Comment;
import uz.pdp.lesson_2task_2.entity.Product;
import uz.pdp.lesson_2task_2.entity.User;

import java.sql.Date;

@Projection(types = Comment.class)
public interface CustomComment {

    Integer getId();

    User getUser();

    String getMessage();

    Date getDate();

    Integer getMark();

    Product getProduct();
}
