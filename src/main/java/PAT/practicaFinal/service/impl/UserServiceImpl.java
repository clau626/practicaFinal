package PAT.practicaFinal.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import PAT.practicaFinal.model.UserModel;
import PAT.practicaFinal.repository.UserRepository;
import PAT.practicaFinal.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    public UserModel user;
    
    @Autowired
    private UserRepository repository;

    @Override
    public Iterable<UserModel> retrieveAll(){
        return repository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username ){
        UserModel user = repository.findByUsername(username);
        this.user = user;
        System.out.println(user.getUsername());
        List<GrantedAuthority> authorities = new ArrayList<>();
        UserDetails newUser = new User(user.getUsername(), user.getPassword(), authorities);
        return newUser;
    }

    @Override
    public UserModel retrieveUser(){
        return this.user;
    }
}
