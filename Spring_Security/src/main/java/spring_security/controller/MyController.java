package spring_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getInfoForAllEmp() {
        return "view-for-all-employees";
    }

    @GetMapping("/hr_info")
    public String getInfoOnlyForHR() {
        return "view-only-for-hr";
    }

    @GetMapping("/manager_info")
    public String getInfoOnlyForManager() {
        return "view-only-for-managers";
    }
}
