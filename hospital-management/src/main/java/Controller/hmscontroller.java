package Hospital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hms")
public class hmscontroller {

    @GetMapping("/health")
    public String health() {
        System.out.println("yuvaraju");
        return "Hospital management system is running";
    }

}
