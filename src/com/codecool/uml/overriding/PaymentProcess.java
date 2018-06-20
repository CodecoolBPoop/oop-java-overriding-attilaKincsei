package com.codecool.uml.overriding;

import java.util.ArrayList;
import java.util.List;

public class PaymentProcess extends AbstractProcess {

    int id;

    static List<PaymentProcess> paymentProcesses = new ArrayList<>(0);

    public PaymentProcess() {
        this.id = paymentProcesses.size() + 1;
        paymentProcesses.add(this);
    }

    @Override
    protected void action(Orderable item) {
        item.pay();
        System.out.println("action() function in PaymentProcess works");
    }
}
