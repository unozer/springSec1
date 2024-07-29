package it.gp.sprinsec1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping(path = {"/", "/index"})
    public String getHomePage() {
        return "index";
    }

    @GetMapping("/admin")
    public String getAdminPage() {
        return "/admin/admin_page";
    }

    @GetMapping("/user1")
    public String getUserPage1() {
        return "/user/user1";
    }

    @GetMapping("/user2")
    public String getUserPage2() {
        return "user/user2";
    }
}
