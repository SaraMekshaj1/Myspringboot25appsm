package SimpleSbootproject.sprbootpro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {

    @GetMapping(path="/hello")
    public String helloWorld(){
        return "Hi good people :) ";
    }
}
