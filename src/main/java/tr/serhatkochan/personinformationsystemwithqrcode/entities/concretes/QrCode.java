package tr.serhatkochan.personinformationsystemwithqrcode.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "qr_codes") // veya bunu qrCodes yazacaz duruma göre.
@Entity // ORM Tech
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QrCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // yazılabilir ama gerek var mı bi kontrol et.
    private int id; // int, Integer, Long ???

    private String title;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

//    private string code; // @Column(name = "code", unique=true)
}
