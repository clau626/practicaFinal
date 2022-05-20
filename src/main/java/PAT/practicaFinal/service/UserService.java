package PAT.practicaFinal.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import PAT.practicaFinal.model.UserModel;

public interface UserService extends UserDetailsService {
    
    Iterable<UserModel> retrieveAll();
    UserModel retrieveUser();
}
