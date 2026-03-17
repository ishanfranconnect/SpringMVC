package spr.mvc;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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


    @RequestMapping("helloform")
    public String showForm(){
        return "index1";
    }
    @RequestMapping(path="/showresult",method=RequestMethod.POST)
    public String handleForm(@RequestParam("name")String n, @RequestParam("email")String e, @RequestParam("password")String p,Model m){
        System.out.println("Name is:"+n);
        System.out.println("Email is:"+e);
        System.out.println("Password is:"+p);

        m.addAttribute("name",n);
        m.addAttribute("Email",e);
        m.addAttribute("Password",p);
        return "result";
    }
   
}
