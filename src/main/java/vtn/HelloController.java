
package vtn;

import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sophiepham
 */
@Controller
public class HelloController {
    
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello, welcome to Spring Boot!";
    }
    
    @RequestMapping("/hello2")
    public ModelAndView hello2(@RequestParam(defaultValue = "Khanh", value = "name")String name){
        HashMap<String, String> model = new HashMap<>();
        model.put("name", name);
        return new ModelAndView("hello", model);
    }
}
