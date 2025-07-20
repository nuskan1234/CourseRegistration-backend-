package lk.ijse.cmjd_111.CourseRegistration2025.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/V1/health")
public class HealthTest {
    @GetMapping
    public String heatrBeat(){
        return "Student Registration Running";
    }
}
