package uz.pdp.lesson_2task_2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private User user;

    @Column(nullable = false)
    private String message;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private Integer mark;

    @ManyToOne
    private Product product;
}
