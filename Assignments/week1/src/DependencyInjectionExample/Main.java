package DependencyInjectionExample;

public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository=new CustomerRepositoryImpl();
        //injecting repository into service
        CustomerService customerService=new CustomerService(customerRepository);
        Customer customer=customerService.getCustomer("21");
        System.out.println("Customer Name: "+customer.getName());
    }
}
