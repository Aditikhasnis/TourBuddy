package tms.demo.repository;

public class PaymentRepository {
    // Singleton implementation for PaymentRepository
    private static PaymentRepository instance;

    private PaymentRepository() {
        // Private constructor to prevent instantiation from outside
    }

    public static PaymentRepository getInstance() {
        if (instance == null) {
            instance = new PaymentRepository();
        }
        return instance;
    }

    // Other fields and methods related to PaymentRepository class
}
