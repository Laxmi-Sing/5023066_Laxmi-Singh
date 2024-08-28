package DependencyInjectionExample;

public class CustomerService {
    private CustomerRepository customerRepository;
    //injection
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }
    public Customer getCustomer(String id){
        return customerRepository.findCustomerById(id);
    }
}
