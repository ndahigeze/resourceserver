package com.example.resourceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableResourceServer
@RestController
public class ResourceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResourceServerApplication.class, args);
    }

    Map<Integer,Account> accMap=new HashMap<>();

    @RequestMapping("/account")
    private Collection<Account> getAccountDetails(){
        if(ObjectUtils.isEmpty(accMap)){
            accMap.put(1222,new Account(1234,"saving","kabaka","BK"));
            accMap.put(1221,new Account(124,"saving","kaka","bk"));
            accMap.put(1200,new Account(124,"current","kaka","BK"));
        }
        return accMap.values();
    }
}
