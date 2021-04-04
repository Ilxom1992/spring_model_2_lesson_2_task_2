package uz.pdp.lesson_2task_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.lesson_2task_2.entity.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {


}
