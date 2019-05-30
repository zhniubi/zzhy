package com.jk.mapper;

import com.jk.model.TreeBean;
import com.jk.model.UserBean;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    int findUserCount();

    List<UserBean> findUserList(int start, Integer rows);

    @Select("select id,text,url as path,pid from t_nav where pid=#{value}")
    List<TreeBean> findTreeChildren(Integer id);
}
