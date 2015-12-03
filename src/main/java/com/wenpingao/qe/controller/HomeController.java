package com.wenpingao.qe.controller;

import com.wenpingao.qe.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WenPinGao on 2015/11/16.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(value = "/index")
    public String index(ModelMap map) throws Exception{
        return "Home/index";
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
