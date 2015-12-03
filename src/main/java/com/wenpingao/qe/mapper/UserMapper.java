package com.wenpingao.qe.mapper;

import com.wenpingao.qe.pojo.User;

import java.util.List;

/**
 * Created by WenPinGao on 2015/11/7.
 */
public interface UserMapper {
    List<User> findAll();
    User findUserById(String id);
    User findUser(User user);
    void insert(User user);
    int getDataCount();
    List<User> findUserByPage(int start,int count);
}
