package com.cloudnest.login.controller;

import com.cloudnest.util.constant.UtilConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class LoginController {

    @GetMapping("/health")
    public String health(){
        return String.format("%s_%s",UtilConstants.APP_NAME,"ok");
    }
}
