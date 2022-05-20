package PAT.practicaFinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import PAT.practicaFinal.model.UserModel;
import PAT.practicaFinal.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService service;
    @GetMapping("/users")
    public ResponseEntity<Iterable<UserModel>> retrieveAll(){
        return ResponseEntity.ok().body(service.retrieveAll());
    }

    @GetMapping("/user")
    public ResponseEntity<UserModel> retrieveUser(){
        return ResponseEntity.ok().body(service.retrieveUser());
    }

}
