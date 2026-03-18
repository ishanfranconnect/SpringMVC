package spr.mvc;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Employee {
    private String name;
    private String email;
    private String password;
    private Long mobile;
   @DateTimeFormat(pattern = "yyyy-MM-dd")
   private Date dob;
    private Address a=new Address();
    private List<String> skills;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    public void setMobile(Long mobile){
        this.mobile=mobile;
    }
    public Long getMobile(){
        return mobile;
    }
    public void setDob(Date dob){
        this.dob=dob;
    }
    public Date getDob(){
        return dob;
    }
   
    public void setA(Address a){
        this.a=a;
    }
    public Address getA(){
        return a;
    }
    public void setSkills(List<String> skills){
        this.skills=skills;
    }
    public List<String> getSkills(){
        return skills;
    }

    @Override
    public String toString(){
        return "Employee[name="+name+",Email="+email+",Password="+password+",Mobile="+mobile+",Date="+dob+",Skills="+skills+",a="+a+"]";
    }

}
