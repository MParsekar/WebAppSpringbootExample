package mes.bca.firstapp.RestController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mes.bca.firstapp.DTO.Student;
import mes.bca.firstapp.Services.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController //mark somethign 
public class SecondController {
    
    @Autowired// Creates an object for us 
    StudentService studentService;

    @GetMapping("/add")
    public int add(@RequestParam int num1, int num2) {
        return num1 + num2;
    }

    @PostMapping("/save")
    public List<mes.bca.firstapp.Entity.Student> save(@RequestBody Student student) {
        studentService.saveStudent(student);
        student.setName("Changed");
        return studentService.getStudentDetails();
    }
    
}
