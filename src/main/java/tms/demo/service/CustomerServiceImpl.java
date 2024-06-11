// package tms.demo.service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import tms.demo.model.Customer;
// import tms.demo.repository.CustomerRepository;
// import tms.demo.service.CustomerService;

// @Service
// public class CustomerServiceImpl implements CustomerService {

//     @Autowired
//     private CustomerRepository customerRepository;

//     @Override
//     public void saveCustomer(Customer customer) {
//         customerRepository.save(customer);
//     }

//     @Override
//     public Customer findCustomerByUsername(String username) {
//         return customerRepository.findByUsername(username);
//     }
// }
