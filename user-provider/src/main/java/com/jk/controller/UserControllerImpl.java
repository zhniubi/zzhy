package com.jk.controller;

import com.jk.mapper.UserMapper;
import com.jk.model.TreeBean;
import com.jk.model.UserBean;
import com.jk.service.UserServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Controller
public class UserControllerImpl implements UserServiceApi {

    @Autowired
    private UserMapper userMapper;

    @Override
    @RequestMapping(value = "findUserList",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findUserList(Integer page, Integer rows) {
        HashMap<String, Object> params = new HashMap<>();
        int total= userMapper.findUserCount();
        int start=(page-1)*rows;
        List<UserBean> list=userMapper.findUserList(start,rows);
        params.put("total",total);
        params.put("rows",list);
        return params;
    }

    @Override
    @RequestMapping(value = "findTree",method = RequestMethod.GET)
    @ResponseBody
    public List<TreeBean> findTree() {
       Integer id=0;
       return findTreeNode(id);
    }

    private List<TreeBean> findTreeNode(Integer id) {
        List<TreeBean> trees=userMapper.findTreeChildren(id);
        for (TreeBean treeBean : trees) {
            List<TreeBean> findTreeNode = findTreeNode(treeBean.getId());
            if(findTreeNode!=null && findTreeNode.size()>0){
                treeBean.setNodes(findTreeNode);
            }else{
                treeBean.setSelectable(true);
            }

        }
        return trees;
    }
}
