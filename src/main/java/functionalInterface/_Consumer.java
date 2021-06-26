package functionalInterface;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer customer = new Customer("Asiri","07038383207");

//        Normal Java Function
        greetCustomer(customer);

//       Consumer Functional Interface
        getCustomerConsumer.accept(customer);
    }

    static Consumer<Customer> getCustomerConsumer = customer ->
            System.out.println("Hello " + customer.name + ", thanks for registering phone number " +
                    customer.contact);

    private static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.name + ", thanks for registering phone number " +
                customer.contact);
    }

    public static class Customer {
        private final String name;
        private final String contact;

        public Customer(String name, String contact) {
            this.name = name;
            this.contact = contact;
        }
    }
}
