package com.atguigu.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author cyl
 * @create 2021/4/7 19:56
 */

@RestController
@RequestMapping("/hello")
public class UserController {

    @RequestMapping("/add")
    @PreAuthorize("hasAuthority('add')")//表示用户必须拥有add权限才能调用当前方法
    public String add(){
        System.out.println("add");
        return "add";
    }

    @RequestMapping("/update")
    @PreAuthorize("hasRole('ROLE_ADMIN')")//表示用户必须拥有add权限才能调用当前方法
    public String update(){
        System.out.println("update");
        return "update";
    }

    @RequestMapping("/delete")
    @PreAuthorize("hasRole('ABC')")//表示用户必须拥有add权限才能调用当前方法
    public String delete(){
        System.out.println("add");
        return "add";
    }



}
