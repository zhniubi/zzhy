package com.jk.controller;

import com.jk.model.TreeBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    //查询分页
    @RequestMapping(value = "findUserList",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> findUserList(Integer page, Integer rows){

        return userService.findUserList(page,rows);
    }

    //左侧菜单树
    @RequestMapping(value = "findTree",method = RequestMethod.GET)
    @ResponseBody
    public List<TreeBean> findTree(){

        return userService.findTree();
    }
}
