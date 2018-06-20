package com.codecool.uml.overriding;

/**
 * I can invoke a method of the abstract class with an instance of
 * - both the abstract class and
 * - its subclass.
 * */
public class Webshop {

    private static Order orderNo1 = new Order();
    // TODO: why cannot invoke methods defined only in the subclass?
    // How to getStatus() of object of orderable type
    // Also: how do you call this?
    private static Orderable orderableNo1 = new Order();

    private static void testProcess() {
        AbstractProcess checkoutOne = new CheckoutProcess();
        AbstractProcess paymentOne = new PaymentProcess();
        System.out.println(orderNo1.getStatus());
        checkoutOne.process(orderNo1);
        System.out.println(orderNo1.getStatus());
        paymentOne.process(orderNo1);
        System.out.println(orderNo1.getStatus());

    }


    public static void main(String[] args) {
        testProcess();
    }
}
