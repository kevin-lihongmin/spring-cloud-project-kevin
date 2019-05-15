package com.kevin.consumer;

import com.kevin.api.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonClientController implements UserInterface {

    private final UserInterface userInterface;

    @Autowired
    public PersonClientController(UserInterface userInterface) {

        this.userInterface = userInterface;
    }

    @Override
    @RequestMapping("getUser/{id}")
    public String getUser(@PathVariable Long id) {

        return userInterface.getUser(id);
    }
}
