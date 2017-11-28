package com.baidu.controller;

import com.baidu.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.plugin.javascript.navig.Array;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * Created by dllo on 17/11/27.
 */
@Controller
public class MainController {

    @Resource
    private StudentService studentService;

    @RequestMapping({"/","/home"})
    public String indexPage(){
        return "home";
    }

    // Json/xml
    @ResponseBody
    @RequestMapping("/getall")
    public Object jsonData(){
        return studentService.findAll();
    }

}
