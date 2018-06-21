package com.codecool.uml.overriding;

/**
 * I can invoke a method of the abstract class with an instance of
 * - both the abstract class and
 * - its subclass.
 * */
public class Webshop {

    private static Orderable orderableNo1 = new Order();

    private static void testProcess() {
        AbstractProcess checkoutOne = new CheckoutProcess();
        AbstractProcess paymentOne = new PaymentProcess();
        System.out.println(((Order) orderableNo1).getStatus());
        checkoutOne.process(orderableNo1);
        System.out.println(((Order) orderableNo1).getStatus());
        paymentOne.process(orderableNo1);
        System.out.println(((Order) orderableNo1).getStatus());
    }


    public static void main(String[] args) {
        testProcess();
    }
}
