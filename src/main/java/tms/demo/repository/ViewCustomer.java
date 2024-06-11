package tms.demo.repository;

import java.util.Iterator;
import java.util.List;

import tms.demo.model.Customer;

public class ViewCustomer implements Iterator<Customer> {
    private List<Customer> customers;
    private int index;

    private ViewCustomer(List<Customer> customers) {
        this.customers = customers;
        this.index = 0;
    }

    public static ViewCustomer generate(List<Customer> customers) {
        return new ViewCustomer(customers);
    }

    @Override
    public boolean hasNext() {
        return index < customers.size();
    }

    @Override
    public Customer next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("No more customers available");
        }
        return customers.get(index++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove operation is not supported");
    }
}