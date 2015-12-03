package com.wenpingao.qe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Created by WenPinGao on 2015/11/16.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    public void index(HttpServletRequest request,HttpServletResponse response) throws Exception{
        PrintWriter writer = response.getWriter();
        writer.print("Home/index");
        writer.flush();



        writer.close();
    }
}
