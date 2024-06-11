package tms.demo.model;

// Concrete implementation of Payment for UPI transactions
public class UpiTransaction implements Payment {
    private Long id; // Assuming payment ID is stored in the UpiTransaction class
    private String upiId;

    // Constructor
    public UpiTransaction(Long id, String upiId) {
        this.id = id;
        this.upiId = upiId;
    }

    // Clone method
    @Override
    public Payment clone() {
        return new UpiTransaction(this.id, this.upiId);
    }

    // Method to process the UPI transaction
    @Override
    public void processPayment() {
        // Implementation to process UPI transaction
        System.out.println("Processing UPI transaction...");
    }

    // Method to get the ID of the payment
    @Override
    public Long getId() {
        return id;
    }
}
