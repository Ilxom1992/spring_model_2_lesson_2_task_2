package uz.pdp.lesson_2task_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson_2task_2.entity.Invoice;
import uz.pdp.lesson_2task_2.entity.Order;
import uz.pdp.lesson_2task_2.entity.User;

import java.sql.Date;

@Projection(types = Invoice.class)
public interface CustomInvoice {

    Integer getId();

    User getCustomer();

    Order getOrder();

    Double getPrice();

    Date getCreatedDate();

    Date getDueDate();

    boolean isStatus();
}
