package pro.sky.example.webexamplehomework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkController {
    @GetMapping
    public String hello() {
        return "Hello";
    }
}
