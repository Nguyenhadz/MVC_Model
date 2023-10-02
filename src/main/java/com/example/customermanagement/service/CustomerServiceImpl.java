package com.example.customermanagement.service;

import com.example.customermanagement.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService{
    private static final Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Ha", "abc", "HN"));
        customers.put(2, new Customer(2, "Dat", "haha", "HN"));
        customers.put(3, new Customer(3, "Duy", "xyz", "HN"));
        customers.put(4, new Customer(4, "Duong", "acg", "HN"));
        customers.put(5, new Customer(5, "Kien", "had", "HN"));
        customers.put(6, new Customer(6, "Hung", "hrr", "HN"));
    }

    @Override
    public List<Customer> finAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
