package tr.serhatkochan.personinformationsystemwithqrcode.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.serhatkochan.personinformationsystemwithqrcode.entities.concretes.User;


public interface UserRepository extends JpaRepository<User, Long> {
}
