package uz.pdp.lesson_2task_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson_2task_2.entity.User;

@Projection(types = User.class)
public interface CustomUser {

    Integer getId();

    String getFirstName();

    String getLastName();

    String getEmail();

    String getPhoneNumber();

    Integer getPhoto();
}
