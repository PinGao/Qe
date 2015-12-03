package com.wenpingao.qe.controller;

import com.wenpingao.qe.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by WenPinGao on 2015/11/16.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(value = "/index")
    public void index(HttpServletRequest request,HttpServletResponse response) throws Exception{
        PrintWriter writer = response.getWriter();
        writer.print("Home/index");
        writer.flush();
        writer.close();
    }

    @RequestMapping(value = "/demo")
    public String demo(ModelMap map){
        List<User> users = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            users.add(new User("qwe"+i,"name"+i,"pwd"+i,"email"+i,"tel"+i));
        }
        map.addAttribute("users",users);
        return "Home/demo";
    }
}
