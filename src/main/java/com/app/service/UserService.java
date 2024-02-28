package com.app.service;

import com.app.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
public List<User> store=new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Pratik koli","pratik@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Vaibhav kulkarni","vaibhav@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"BHushan Ahire","bhushan@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Tejas Jagdale","tejas@gmail.com"));
    }
    public List<User> getUsers(){
        return this.store;
    }
}
