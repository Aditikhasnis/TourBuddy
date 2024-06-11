package tms.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CombinedController {

    @GetMapping("/combined")
    public String showCombinedPage() {
        // Render the combined.html template
        return "combined";
    }
}
