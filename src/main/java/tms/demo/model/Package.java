package tms.demo.model;

public class Package {

    private Long id;
    private String packageName;
    private double price;
    private int persons;
    private String customerName;
    private int customerAge;
    private String gender;

    // Default constructor
    public Package() {
    }

    // Constructor with parameters
    public Package(Long id, String packageName, double price, int persons, String customerName, int customerAge, String gender) {
        this.id = id;
        this.packageName = packageName;
        this.price = price;
        this.persons = persons;
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.gender = gender;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
