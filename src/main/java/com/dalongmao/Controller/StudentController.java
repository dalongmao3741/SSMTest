package com.dalongmao.Controller;

import com.dalongmao.Service.studentService;
import com.dalongmao.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import  org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentController {

    @Autowired
    private studentService studentService;

    @RequestMapping(value ="/add",method = RequestMethod.POST)
    public String insert(Student student){
        studentService.insert(student);
        return "redirect:/getAll";
    };

    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable(value = "id") Integer id){
        studentService.delete(id);
        return "redirect:/getAll";
    };
    @RequestMapping(value ="/update" )
    public String update(Student student){
        studentService.update(student);
        return "redirect:/getAll";
    };

    @RequestMapping(value = "/selectById/{id}")
    public ModelAndView selectById(@PathVariable(value = "id") Integer id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("edit");
        modelAndView.addObject("students",studentService.selectById(id));
        return modelAndView;
    };

    @RequestMapping(value = "/getAll")
    public ModelAndView getAll(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("student",studentService.getAll());
        return modelAndView;
    };
}
