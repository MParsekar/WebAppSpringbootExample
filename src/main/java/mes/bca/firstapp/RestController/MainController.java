package mes.bca.firstapp.RestController;

import org.springframework.web.bind.annotation.RestController;

import mes.bca.firstapp.DTO.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/main")
public class MainController {
    @GetMapping("/one")
    public String getMethodName(@RequestParam String param) {
        return param + " returned";
    }
    
    @GetMapping("add")
    public int add(@RequestParam int a, int b) {
        return a + b;
    }
    
    @PostMapping("savedata")
    public Student postMethodName(@RequestBody Student entity) {
        
        
        return entity;
    }
    

   
}
