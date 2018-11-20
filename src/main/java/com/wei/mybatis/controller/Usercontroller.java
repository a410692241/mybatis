package com.wei.mybatis.controller;

import com.wei.mybatis.bo.User;
import com.wei.mybatis.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Usercontroller {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/selectByPrimaryKey")
    @ResponseBody
    public Object selectByPrimaryKey() {
        User user = userDao.selectByPrimaryKey(92);
        return user;
    }
}
