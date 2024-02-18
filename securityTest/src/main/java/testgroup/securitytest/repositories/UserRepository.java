package testgroup.securitytest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import testgroup.securitytest.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User,Long>{
    public Optional<User>findByEmail(String email);
    public Optional<User>getAllBy();
}
