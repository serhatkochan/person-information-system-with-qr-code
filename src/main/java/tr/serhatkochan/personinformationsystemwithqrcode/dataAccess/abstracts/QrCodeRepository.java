package tr.serhatkochan.personinformationsystemwithqrcode.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.serhatkochan.personinformationsystemwithqrcode.entities.concretes.QrCode;

public interface QrCodeRepository extends JpaRepository<QrCode, Integer> {
    boolean existsByCode(String code); // spring Jpa keyword
}
