package com.seyran.leetcodejavasolutions.easy;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CustomersWhoNeverOrders {

    public List<String> customersWhoNeverOrder(
            List<Customer> customers,
            List<Order> orders) {

        Set<Integer> orderedCustomerIds = orders.stream()
                .map(Order::getCustomerId)
                .collect(Collectors.toSet());

        return customers.stream()
                .filter(customer -> !orderedCustomerIds.contains(customer.getId()))
                .map(Customer::getName)
                .collect(Collectors.toList());
    }

    public static class Customer {
        private final int id;
        private final String name;

        public Customer(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public static class Order {
        private final int customerId;

        public Order(int customerId) {
            this.customerId = customerId;
        }

        public int getCustomerId() {
            return customerId;
        }
    }
}