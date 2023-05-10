package tr.serhatkochan.personinformationsystemwithqrcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.serhatkochan.personinformationsystemwithqrcode.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
