package tms.demo.controller;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;

// @Controller
// public class PaymentController {
//     // Singleton implementation for PaymentController
//     private static PaymentController instance;

//     private PaymentController() {
//         // Private constructor to prevent instantiation from outside
//     }

//     public static PaymentController getInstance() {
//         if (instance == null) {
//             instance = new PaymentController();
//         }
//         return instance;
//     }

//     @GetMapping("/payment")
//     public String showPaymentPage() {
//         return "payment";
//     }

//     @PostMapping("/processPayment")
// public String processPayment() {
//     return "redirect:/"; // Redirect to the home page
// }

// }

// PaymentController class
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PaymentController {

    @GetMapping("/payment")
    public String showPaymentPage() {
        return "payment";
    }

    @PostMapping("/processPayment")
    public String processPayment() {
        // Process payment logic
        return "redirect:/"; // Redirect to the home page
    }
}
