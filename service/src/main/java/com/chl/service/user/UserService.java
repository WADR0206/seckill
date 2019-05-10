package com.chl.service.user;

import com.chl.dao.UserMapper;
import com.chl.entity.User;
import com.chl.tools.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.chl.tools.Result.ok;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public boolean insertUser() {
        User user = new User();
        user.setUsername("chl")
                .setEmail("91231141@qq.com")
                .setPassword("123");
        return userMapper.insert(user) > 0;
    }

    public Result query(int pageNum, int pageSize) {
        PageInfo<User> userList = PageHelper.startPage(pageNum,pageSize).doSelectPageInfo(()->userMapper.selectAll());
        return ok(userList);
    }
}
