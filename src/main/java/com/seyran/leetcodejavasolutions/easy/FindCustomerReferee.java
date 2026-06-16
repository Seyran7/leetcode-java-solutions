package com.seyran.leetcodejavasolutions.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCustomerReferee {

    public static void main(String[] args) {

        List<Customer> customers = Arrays.asList(
                new Customer(1, "Will", null),
                new Customer(2, "Jane", null),
                new Customer(3, "Alex", 2),
                new Customer(4, "Bill", null),
                new Customer(5, "Zack", 1),
                new Customer(6, "Mark", 2)
        );

        List<String> result = customers.stream()
                .filter(c -> c.getRefereeId() == null || c.getRefereeId() != 2)
                .map(Customer::getName)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}

class Customer {

    private int id;
    private String name;
    private Integer refereeId;

    public Customer(int id, String name, Integer refereeId) {
        this.id = id;
        this.name = name;
        this.refereeId = refereeId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getRefereeId() {
        return refereeId;
    }
}