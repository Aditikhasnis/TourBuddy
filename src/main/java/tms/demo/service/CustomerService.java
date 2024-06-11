// package tms.demo.service;

// import tms.demo.model.Customer;

// public interface CustomerService {
//     void saveCustomer(Customer customer);
//     Customer findCustomerByUsername(String username);
// }
package tms.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tms.demo.model.Customer;
import tms.demo.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }



    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    public Customer getCustomerByUsername(String username) {
        return customerRepository.findByUsername(username);
    }
}
