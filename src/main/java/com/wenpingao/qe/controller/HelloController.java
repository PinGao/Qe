package com.wenpingao.qe.controller;

import com.wenpingao.qe.pojo.User;
import com.wenpingao.qe.service.UserService;
import com.wenpingao.qe.util.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @Resource
    private UserService userService;
    private int pageSize = 5;
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String printWelcome(ModelMap model,HttpServletRequest request) throws Exception {
        model.addAttribute("message", "Hello world!");
        int pageIndex;
       try{
           pageIndex = Integer.parseInt(request.getParameter("pi"));
       }catch (Exception e){
           pageIndex = 1;
       }
        PageBean<User> pbu = userService.findUsersBypage(pageIndex,pageSize,request);
        model.addAttribute("pbu",pbu);
        return "hello";
    }
    @RequestMapping("showRes")
    public String showRes(){
        return "res";
    }

    @RequestMapping(value = "/userSave",method = RequestMethod.POST)
    public void userSave(User user,HttpServletResponse response) throws Exception{
        userService.userSave(user);
        response.sendRedirect("/hello/index");
    }
}