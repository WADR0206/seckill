package com.chl.dao;

import com.chl.dao.common.CommonMapper;
import com.chl.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends CommonMapper<User> {

    @Insert("insert into user(username,email,password) values(#{username},#{email},#{password})")
    int insertTemplate(User user);

    @Select("select id,username,email,create_time from user")
    List<User> queryTemplate();
}
