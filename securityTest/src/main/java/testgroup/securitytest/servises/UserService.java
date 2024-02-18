package testgroup.securitytest.servises;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import testgroup.securitytest.entities.User;
import testgroup.securitytest.repositories.UserRepository;

@Service
@AllArgsConstructor
public class UserService {
    UserRepository repository;
    private BCryptPasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }
    public void save(User user){
        user.setPassword(encoder().encode(user.getPassword()));
        repository.save(user);
    }
    public void getAll(){
        repository.getAllBy();
    }
}
