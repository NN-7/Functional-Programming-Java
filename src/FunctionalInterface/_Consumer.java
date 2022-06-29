package FunctionalInterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer joe = new Customer("Joe", "657392");
        greetCustomerConsumer.accept(joe);
    }

    static class Customer {
        private String customerName;
        private String number;

        public Customer(String customerName, String number) {
            this.customerName = customerName;
            this.number = number;
        }
    }

    /*

    Consumers obtain an input but return no output. They essentially 'consume' the input.

    To make a consumer

    1. Put your wanted class in between the consumer's arrow brackets.

    Example:

    Consumer<Integer>

    2. Afterwards, give it a name.

    Consumer<Integer> printInteger

    3. Now, we must define what the consumer will do. Write the name of the variable you want to be working with, add ->
       after it, and write what you want the consumer to do with the input. In this case we'll be using 'number' as our
       variable, and we'll be printing it out.

    number -> System.out.println(number)

    Now combine the two, putting in an equals sign in between:

    Consumer<Integer> printInteger = number -> System.out.println(number);

    */

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("name, phone number: "+
            customer.customerName+", "+customer.number);
}
