package test.outside;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("outside")
public class OutsideController {
    @GetMapping("test")
    public String outside() {
        return "Testing a based component scan";
    }
}
