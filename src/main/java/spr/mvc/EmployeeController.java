package spr.mvc;
import org.springframework.stereotype.Controller;
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
}
