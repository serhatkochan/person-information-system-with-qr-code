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
    private Integer id; // Integer, Integer, Long ???

    private String username;

    private String password;

    private String name;

    private boolean isAdmin;

    @OneToMany(mappedBy = "user")
    private List<QrCode> qrCodes;
}
