package PAT.practicaFinal.repository;

import org.springframework.data.repository.CrudRepository;

import PAT.practicaFinal.model.UserModel;

public interface UserRepository extends CrudRepository<UserModel, Long> {
    public UserModel findByUsername(String username);
}
