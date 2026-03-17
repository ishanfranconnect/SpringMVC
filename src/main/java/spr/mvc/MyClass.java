package spr.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyClass {

    @RequestMapping("/myurl")
    public String hello(Model m){
        m.addAttribute("name","Ishan");
        return "index";
    }
}
