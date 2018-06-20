package com.codecool.uml.overriding;

import java.util.ArrayList;
import java.util.List;

class CheckoutProcess extends AbstractProcess {

    public int id;

    static List<CheckoutProcess> checkoutProcesses = new ArrayList<>(0);

    public CheckoutProcess() {
        this.id = checkoutProcesses.size() + 1;
        checkoutProcesses.add(this);
    }

    @Override
    protected void action(Orderable item) {
        item.checkout();
        System.out.println("action() function in CheckoutProcess works");
    }
}
