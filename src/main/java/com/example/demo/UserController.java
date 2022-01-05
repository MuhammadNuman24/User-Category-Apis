package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/list")
    public List<UserModel> getModel() {
        return Collections.singletonList(new UserModel(1l, "Numan", Collections.singletonList("TEST IMAGE"), 01, "Student", "Numan", "Khan", "numanrazzaq24@gmail.com", "Pakistan", "DevGuru", "03041792624", "Jazz", "Male", "21-11-2005", "Pakistan", "Vehari", "24/WB Vehari", "61100"));
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public UserModel postString(@RequestBody UserModel model) {
        return model;
    }

    @PutMapping("/{id}")
    public UserModel updateModel(@PathVariable("id") long webId, @RequestBody UserModel model) {
        return model;
    }

    @GetMapping("/{id}")
    public UserModel getModel(@PathVariable("id") long webId) {
        return new UserModel(webId, "Numan", Collections.singletonList("TEST IMAGE"), 01, "Student", "Numan", "Khan", "numanrazzaq24@gmail.com", "Pakistan", "DevGuru", "03041792624", "Jazz", "Male", "21-11-2005", "Pakistan", "Vehari", "24/WB Vehari", "61100");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean deleteRequest(@PathVariable("id") long webId) {
        return true;
    }
}