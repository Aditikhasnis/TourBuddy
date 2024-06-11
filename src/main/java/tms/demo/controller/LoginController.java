package tms.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import tms.demo.model.Customer;
import tms.demo.repository.CustomerRepository;

@Controller

public class LoginController {

    private final CustomerRepository customerRepository;

    @Autowired
    public LoginController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Assuming you have a login.html template in your templates directory
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, RedirectAttributes redirectAttributes) {
        // Implement login logic here, authenticate user based on username and password
        for (Customer customer : customerRepository.findAll()) {
            if (customer.getUsername().equals(username) && customer.getPassword().equals(password)) {
                // Login successful, redirect to dashboard or home page
                return "combined"; // Assuming you have a dashboard.html template
            }
        }
        // Login failed, redirect back to login page with error message
        redirectAttributes.addFlashAttribute("error", "Invalid username or password");
        return "redirect:/login";
    }
}
