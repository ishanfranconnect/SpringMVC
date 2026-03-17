package spr.mvc;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }
    @RequestMapping("/hellourl")
    public String hello(){
        System.out.println("Wellcome to spring MVC...");
        return "index";
    }

    @RequestMapping("/contact")
    public String hi(){
        return "contactUs";
    }

    @RequestMapping("/hello")
    public String hello(Model m){
        m.addAttribute("name","Ishan");
        m.addAttribute("Id",1);
        List<String> city=new ArrayList<String>();
        city.add("Muzaffarpur");
        city.add("Patna");
        city.add("Bhopal");
        m.addAttribute("cities", city);
        return "index";
    }
}
