package mes.bca.firstapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //Annotation
public class HomeConrtoller {
    
    @GetMapping("/") //Annotated the mathod as url 
    public String index(@RequestParam String name) {
        System.out.println(name);
        return "index";
    }
}
