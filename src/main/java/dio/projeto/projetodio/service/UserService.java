package dio.projeto.projetodio.service;

import dio.projeto.projetodio.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
