package com.chl.controller.user;

import com.chl.service.user.UserService;
import com.chl.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/insert")
    public String helloUser() {
        boolean flag = userService.insertUser();
        return flag ? "success" : "fail";
    }

    @GetMapping("/query")
    public Result query(@RequestParam(value = "pageSize",defaultValue = "10") int pageSize, @RequestParam(value = "pageNum",defaultValue = "1") int pageNum) {
        return userService.query(pageNum,pageSize);
    }
}
