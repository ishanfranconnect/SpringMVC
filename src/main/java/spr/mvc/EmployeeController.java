package spr.mvc;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public String handleForm(@ModelAttribute("e1") Employee e1,BindingResult result){
        if(result.hasErrors()){
            return "index1";
        }
        return "result";
    }
}
