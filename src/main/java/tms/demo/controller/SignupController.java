package tms.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import tms.demo.model.Customer;
import tms.demo.repository.CustomerRepository;

@Controller
public class SignupController {

    private final CustomerRepository customerRepository;

    @Autowired
    public SignupController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/signup")
    public String showSignupForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "signup"; // Assuming you have a signup.html template in your templates directory
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        // Perform custom validation
        if (customer.getUsername() == null || customer.getUsername().isEmpty()) {
            bindingResult.rejectValue("username", "error.customer", "Username is required");
        }
        if (customer.getPassword() == null || customer.getPassword().isEmpty()) {
            bindingResult.rejectValue("password", "error.customer", "Password is required");
        }
        if (customer.getName() == null || customer.getName().isEmpty()) {
            bindingResult.rejectValue("name", "error.customer", "Name is required");
        }
        // Add more validation checks as needed

        if (bindingResult.hasErrors()) {
            return "signup"; // Return to the signup form if there are validation errors
        }

        try {
            customerRepository.save(customer);
            redirectAttributes.addFlashAttribute("success", "Sign up successful! Please log in.");
            return "redirect:/login"; // Redirect to login page after successful signup
        } catch (Exception e) {
            bindingResult.rejectValue(null, "error.customer", "An error occurred during sign up. Please try again.");
            return "signup"; // Return to the signup form if there is an exception
        }
    }
}
