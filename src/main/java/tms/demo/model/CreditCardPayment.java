package tms.demo.model;

// Concrete implementation of Payment for credit card payments
public class CreditCardPayment implements Payment {
    private Long id; // Assuming payment ID is stored in the CreditCardPayment class
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    // Constructor
    public CreditCardPayment(Long id, String cardNumber, String expiryDate, String cvv) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    // Clone method
    @Override
    public Payment clone() {
        return new CreditCardPayment(this.id, this.cardNumber, this.expiryDate, this.cvv);
    }

    // Method to process the credit card payment
    @Override
    public void processPayment() {
        // Implementation to process credit card payment
        System.out.println("Processing credit card payment...");
    }

    // Method to get the ID of the payment
    @Override
    public Long getId() {
        return id;
    }
}
