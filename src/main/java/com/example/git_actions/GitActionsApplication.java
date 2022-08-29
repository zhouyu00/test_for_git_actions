package com.example.git_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GitActionsApplication {

    @RequestMapping("/gitActions")
    public String gitActionsLearn(){
        return "this is for git actions learning";
    }

    public static void main(String[] args) {
        SpringApplication.run(GitActionsApplication.class, args);
    }

}
