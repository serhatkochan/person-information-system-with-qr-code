package tr.serhatkochan.personinformationsystemwithqrcode.entities.concretes;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name = "users")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // yazılabilir ama gerek var mı bi kontrol et.
    private int id; // int, Integer, Long ???
    private String name;

}
