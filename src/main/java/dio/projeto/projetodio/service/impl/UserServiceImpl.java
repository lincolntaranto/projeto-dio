package dio.projeto.projetodio.service.impl;

import dio.projeto.projetodio.domain.model.User;
import dio.projeto.projetodio.domain.repository.UserRepository;
import dio.projeto.projetodio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNick(userToCreate.getAccount().getNick())){
            throw new IllegalArgumentException("This nick already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
