package com.wenpingao.qe.service;

import com.wenpingao.qe.mapper.UserMapper;
import com.wenpingao.qe.pojo.User;
import com.wenpingao.qe.util.DbConnection;
import com.wenpingao.qe.util.MD5Util;
import com.wenpingao.qe.util.PageBean;
import com.wenpingao.qe.util.Uuid;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by WenPinGao on 2015/11/16.
 */

@Service
public class UserService {
    public void userSave(User user) throws Exception{
        SqlSession session = DbConnection.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.insert(new User(Uuid.getUuid(),user.getName(), MD5Util.getMD5(user.getPwd()),user.getEmail(),user.getTel()));
        session.close();
    }

    public PageBean<User> findUsersBypage(int pi,int ps,HttpServletRequest request) throws Exception{
        SqlSession session = DbConnection.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int count = mapper.getDataCount();
        List<User> lu = mapper.findUserByPage((pi - 1)*ps,ps);
        session.close();
        PageBean<User> pu = new PageBean<User>();
        pu.setDc(count);
        pu.setBeanList(lu);
        pu.setPi(pi);
        pu.setPs(ps);
        pu.setUrl(request.getContextPath()+"/hello/index");
        return pu;
    }
}
