package com.example.controller;

import com.example.domain.User;
import com.example.domain.VI;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/quick")
    public String save(){
        System.out.println("Contriller save running");
        return "success";
    }

    @RequestMapping("/quick2")
    public ModelAndView save2(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        modelAndView.addObject("username","quick2测试");
        return modelAndView;
    }

    @RequestMapping("/quick3")
    public String save3(Model model){
        model.addAttribute("username","quick3测试");
        return "success";
    }
    @RequestMapping("/quick4")
    public String save4(HttpServletRequest request){
        request.setAttribute("username","quick4测试");
        return "success";
    }

    @RequestMapping("/quick5")
    public void save5(HttpServletResponse response) {
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        try {
            response.getWriter().print("quick5测试");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/quick6",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String save6(){
        return "quick6测试";
    }

    @RequestMapping(value = "/quick7",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String save7(){
        User user = new User();
        user.setAge(1);
        user.setUsername("quick7测试");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = null;
        try {
            json = objectMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }
    @RequestMapping(value = "/quick8",produces = "application/json; charset=utf-8")
    @ResponseBody
    public User save8(){
        User user = new User();
        user.setAge(1);
        user.setUsername("quick8测试");
        return user;
    }

    @RequestMapping(value = "/quick9",produces = "application/json; charset=utf-8")
    @ResponseBody           //不进行页面跳转
    public void save9(String username,int age) throws IOException{
        System.out.println(username);
        System.out.println(age);
    }

    @RequestMapping(value = "/quick10",produces = "application/json; charset=utf-8")
    @ResponseBody           //不进行页面跳转
    public void save10(User user) throws IOException{
        System.out.println(user);
    }

    @RequestMapping(value = "/quick11",produces = "application/json; charset=utf-8")
    @ResponseBody           //不进行页面跳转
    public void save11(String[] strs) throws IOException{
        System.out.println(Arrays.asList(strs));
    }

    @RequestMapping(value = "/quick12",produces = "application/json; charset=utf-8")
    @ResponseBody           //不进行页面跳转
    public VI save12(VI vi) throws IOException{
        return vi;
    }

    @RequestMapping(value = "/quick13",produces = "application/json; charset=utf-8")
    @ResponseBody           //不进行页面跳转
    public void save13(@RequestBody List<User> userList) throws IOException{
        System.out.println(userList);
    }

    @RequestMapping(value = "/quick14",produces = "application/json; charset=utf-8")
    @ResponseBody           //不进行页面跳转
    public void save14(@RequestParam(value = "name",required = false,defaultValue = "default") String username) throws IOException{
        System.out.println(username);
    }

    @RequestMapping(value = "/quick15/{username}")  //,method = RequestMethod.GET
    @ResponseBody           //不进行页面跳转
    public void save15(@PathVariable(value = "username") String username) throws IOException{
        System.out.println(username);
    }

    @RequestMapping(value = "/quick16")
    @ResponseBody           //不进行页面跳转
    public void save16(Date date) throws IOException{
        System.out.println(date);
    }

    @RequestMapping(value = "/quick17")
    @ResponseBody           //不进行页面跳转
    public void save17(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, HttpSession httpSession) throws IOException{
        System.out.println(httpServletRequest);
        System.out.println(httpServletResponse);
        System.out.println(httpSession);
    }

    @RequestMapping(value = "/quick18")
    @ResponseBody           //不进行页面跳转
    public void save18(@RequestHeader(value = "User-Agent") String user_agent,@CookieValue(value = "JSESSIONID") String jsessionid) throws IOException{
        System.out.println(user_agent);
        System.out.println(jsessionid);
    }

    @RequestMapping(value = "/quick19")
    @ResponseBody           //不进行页面跳转
    public void save19(String username,MultipartFile uploadFile,MultipartFile uploadFile2) throws IOException{
        System.out.println(username);
        System.out.println(uploadFile);
        String originFilename = uploadFile.getOriginalFilename();
        String originFilename2 = uploadFile2.getOriginalFilename();
        uploadFile.transferTo(new File("D:\\temp\\" + originFilename));
        uploadFile2.transferTo(new File("D:\\temp\\" + originFilename2));
    }

    @RequestMapping(value = "/quick20")
    @ResponseBody           //不进行页面跳转
    public void save20(String username,MultipartFile[] uploadFile) throws IOException{
        for (MultipartFile multipartFile:uploadFile){
            String originalFilename = multipartFile.getOriginalFilename();
            multipartFile.transferTo(new File("D:\\temp\\" + originalFilename));
        }
    }
}
