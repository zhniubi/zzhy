package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {

    //跳往查询页面
    @RequestMapping("toUserList")
    public String toUserList(){

        return "userlist";
    }

    //跳往主页面
    @RequestMapping("toMain")
    public String toMain(){

        return "main";
    }
}
