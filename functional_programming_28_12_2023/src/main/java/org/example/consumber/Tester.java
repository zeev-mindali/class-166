package org.example.consumber;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Tester {
    public static void main(String[] args) {
        Customer zeev = new Customer("Zeev","052-4043142");
        greetCustomer(zeev);
        //greetCustomerConsumer.accept(zeev);
        greetCustomerWithNoPhone.accept(zeev,true);
    }

    //old school
    static void greetCustomer(Customer customer){
        System.out.println("Hello "+customer.getCustomerName() + ", thanks for registering phone number "+customer.getCustomerPhoneNumber());
    }

    static Consumer<Customer> greetCustomerConsumer = customer->
            System.out.println("Hello "+customer.getCustomerName() + ", thanks for registering phone number "+customer.getCustomerPhoneNumber());

    static BiConsumer<Customer,Boolean> greetCustomerWithNoPhone = (customer,hidePhone)->
            System.out.println("Hello "+customer.getCustomerName() + ", thanks for registering phone number "+
                    (hidePhone?"***********":customer.getCustomerPhoneNumber()));

}
