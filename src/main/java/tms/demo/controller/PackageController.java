package tms.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import tms.demo.model.Package;

import tms.demo.repository.PackageRepository;

@Controller
public class PackageController {

    private final PackageRepository packageRepository;

    public PackageController(PackageRepository packageRepository) {
        this.packageRepository = packageRepository;
    }

    @GetMapping("/book-package")
    public String bookPackage(Model model) {
        model.addAttribute("package", new Package());
        return "book-package";
    }

    @PostMapping("/book-package")
    public String bookPackage(@RequestParam("packageName") String packageName,
                              @RequestParam("persons") int persons,
                              @RequestParam("customerName") String customerName,
                              @RequestParam("customerAge") int customerAge,
                              @RequestParam("gender") String gender,
                              Model model) {

        // Calculate total price based on the selected package and number of persons
        double totalPrice = 0.0;
        switch (packageName) {
            case "Japan":
                totalPrice = 80000 * persons;
                break;
            case "Europe":
                totalPrice = 70000 * persons;
                break;
            case "America":
                totalPrice = 60000 * persons;
                break;
            default:
                totalPrice = 0.0;
        }

        // Create a Package object with the details
        Package pkg = new Package();
        pkg.setPackageName(packageName);
        pkg.setPrice(totalPrice);
        pkg.setPersons(persons);
        pkg.setCustomerName(customerName);
        pkg.setCustomerAge(customerAge);
        pkg.setGender(gender);

        // Save the package to the database
        packageRepository.addPackage(pkg);

        // Add the booked package details to the model
        model.addAttribute("bookedPackage", pkg);
       
        return "redirect:/book-hotel";
    }
}
