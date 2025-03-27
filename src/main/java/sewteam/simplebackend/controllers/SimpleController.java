package sewteam.simplebackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SimpleController {
    private int num = 0;
    @GetMapping("/get_data")
    public String sendData() {
        num++;
        return "Data" + num + " from backend.";
    }
}