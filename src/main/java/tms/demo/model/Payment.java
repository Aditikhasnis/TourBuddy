package tms.demo.model;

// public class Payment {
//     // Singleton implementation for Payment
//     private static Payment instance;

//     private Payment() {
//         // Private constructor to prevent instantiation from outside
//     }

//     public static Payment getInstance() {
//         if (instance == null) {
//             instance = new Payment();
//         }
//         return instance;
//     }

//     // Other fields and methods related to Payment class
// }

// Payment interface
public interface Payment {
    Payment clone(); // Cloning method

    void processPayment(); // Method to process the payment

    Long getId();
}
