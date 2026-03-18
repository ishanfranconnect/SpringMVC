package spr.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Employee2 {
    @RequestMapping("/emp")
    public String emp(){
        return "emp";
    }

     @RequestMapping(path="/ishan1",method=RequestMethod.POST)
    public String emp2(){
        return "ishan1";
    }
}
