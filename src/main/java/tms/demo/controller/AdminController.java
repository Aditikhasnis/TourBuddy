package tms.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tms.demo.model.Customer;
import tms.demo.model.Hotel;
import tms.demo.model.Package;
import tms.demo.repository.AdminRepository;

import java.util.List;

@Controller
public class AdminController {

    private final AdminRepository adminRepository;

    public AdminController(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @GetMapping("/admin")
    public String getAdminDashboard() {
        return "admin";
    }

    @GetMapping("/admin-hotels")
    public String viewHotels(Model model) {
        List<Hotel> hotels = adminRepository.getAllHotels();
        model.addAttribute("hotels", hotels);
        return "admin-hotels";
    }

    @GetMapping("/admin-customers")
    public String viewCustomers(Model model) {
        List<Customer> customers = adminRepository.getAllCustomers();
        model.addAttribute("customers", customers);
        return "admin-customers";
    }

    @GetMapping("/admin-packages")
    public String viewPackages(Model model) {
        List<Package> packages = adminRepository.getAllPackages();
        model.addAttribute("packages", packages);
        return "admin-packages";
    }
}
