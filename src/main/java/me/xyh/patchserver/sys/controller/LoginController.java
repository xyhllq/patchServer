package me.xyh.patchserver.sys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/main")
    public String main(){
        return "主界面";
    }
}
