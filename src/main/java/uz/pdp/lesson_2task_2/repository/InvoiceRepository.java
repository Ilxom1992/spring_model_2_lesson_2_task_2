package uz.pdp.lesson_2task_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson_2task_2.entity.Invoice;
import uz.pdp.lesson_2task_2.projection.CustomInvoice;

@RepositoryRestResource(path = "invoice", excerptProjection = CustomInvoice.class)
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}
