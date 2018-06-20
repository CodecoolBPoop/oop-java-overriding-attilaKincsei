package com.codecool.uml.overriding;

import java.util.ArrayList;
import java.util.List;

class Order implements Orderable {

    private int id;

    private String status;

    static List<Order> orderList = new ArrayList<>();

    public Order() {
        this.id = orderList.size() + 1;
        this.status = "New";
        orderList.add(this);
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean checkout() {
        this.status = "Checked";
        return true;
    }

    @Override
    public boolean pay() {
        this.status = "Paid";
        return true;
    }
}
