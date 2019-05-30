package com.jk.service;

import com.jk.model.TreeBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public interface UserServiceApi {


    @RequestMapping(value = "findUserList",method = RequestMethod.POST)
    Map<String, Object> findUserList(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows);
    @RequestMapping(value = "findTree",method = RequestMethod.GET)
    List<TreeBean> findTree();
}
