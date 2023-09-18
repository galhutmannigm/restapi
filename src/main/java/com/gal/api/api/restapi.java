package com.gal.api.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restapi {
    
    @GetMapping("/get")
    String Getme()
    {
        return "got me ";
    }    

    @PostMapping("/post")
    String PostMe(String str)
    {
        return(str);
    }
}
