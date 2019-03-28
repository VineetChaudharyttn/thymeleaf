package com.ttn.thymeleaf.controller;

import com.ttn.thymeleaf.entity.Employee;
import com.ttn.thymeleaf.service.GiveEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class TestController {
    /*@RequestMapping(value = "/test",method = RequestMethod.POST)
    String testBody(HttpServletRequest request,Model model){
        model.addAttribute("name" ,request.getParameter("userName"));
        return "hello";
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String test(){
        return "sayHello";
    }*/

    @RequestMapping("/alert")
    String alert() {
        return "Question1";
    }

    @RequestMapping("/color")
    String color() {
        return "Question2";
    }


    /*Question3*/
    @RequestMapping("/question3")
    String question3() {
        return "Question3";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    @ResponseBody
    String emp(@ModelAttribute Employee employee) {

        return "" + employee;
    }


    @Autowired
    GiveEmployee giveEmployee;
    /*Question4*/
    @RequestMapping("/showEmp")
    String show(Model model){

        model.addAttribute("emp",giveEmployee.getEmpList());
        return "Question4";
    }

    /*Question5*/
    @RequestMapping("/page")
    String page(HttpServletRequest request, Model model) {
        if (request.getParameterValues("isAdmin") != null) {
            model.addAttribute("isAdmin", true);
        } else
            model.addAttribute("isAdmin", false);
        ;
        return "Question5";
    }

    @RequestMapping("/check")
    String check() {
        return "CheckUser";
    }

    @RequestMapping("/question6")
    String question6() {
        return "Question6";
    }

    /*Question7*/
    @RequestMapping("/showTime")
    String question7() {
        return "ajaxTime";
    }

    @RequestMapping(value = "/time",method = RequestMethod.POST)
    @ResponseBody
    String time(){
        return new Date().toString();
    }

    /*Question8*/
    @RequestMapping(value = "/table" ,method = RequestMethod.GET)
    String table(Model model){
        model.addAttribute("emplist",giveEmployee.getEmpList());
        return "Question8";
    }

    /*Question9*/
    @RequestMapping("/enums")
    String nums(){
        return "Question9";
    }

    /*Question10*/
    @RequestMapping("/load")
    String loader(){
        return "Question10";
    }

    @RequestMapping(value = "/loaded",method = RequestMethod.POST)
    @ResponseBody
    String ret(@ModelAttribute Employee employee    ) throws InterruptedException {
        Thread.sleep(1000);
        return employee.toString()+"<br/>";
    }

}
