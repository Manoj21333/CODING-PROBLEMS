package com.company;

import java.util.*;
import java.util.stream.Collectors;

class CustomerNotFoundException extends Exception {
    public CustomerNotFoundException(String message) {
        super(message);
    }
}

class Customer implements Comparable<Customer> {
    private int id;
    private String name;
    private int purchaseAmount;

    public Customer(int id, String name, int purchaseAmount) {
        this.id = id;
        this.name = name;
        this.purchaseAmount = purchaseAmount;
    }

    @Override
    public int compareTo(Customer o) {
        if (purchaseAmount == o.purchaseAmount) {
            return name.compareTo(o.name);
        }
        return (purchaseAmount < o.purchaseAmount ? 1 : -1);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPurchaseAmount(int purchaseAmount) {
        this.purchaseAmount += purchaseAmount;
    }

    public String toString() {
        return "ID "+id +" name "+name+ " purchaseAmount "+purchaseAmount;
    }
}

class Customers {
    private List<Customer> customers;

    public Customers(int size) {
        customers = new ArrayList<Customer>(size);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void displayCustomers() {
        Collections.sort(customers);
        customers.forEach(customer -> {
            System.out.println(customer.toString());
        });
    }

    public Customer updateCustomer(int id, int purchaseAmount) throws CustomerNotFoundException {
        List<Customer> customerList = customers.stream().filter(cus -> cus.getId() == id).collect(Collectors.toList());
        if (customerList.size() == 0) {
            throw new CustomerNotFoundException("Customer not found with id: "+id);
        }
        Customer customer = customerList.get(0);
        customer.setPurchaseAmount(purchaseAmount);
        return customer;
    }
}
public class Code {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many customers: ");
        int customer_count = input.nextInt();
        Customers customers = new Customers(customer_count);
        for(int count = 0; count < customer_count; ++count) {
            System.out.println("id ");
            int id = input.nextInt();
            System.out.println("name ");
            String name = input.nextLine();
            input.nextLine();
            System.out.println("purchase amount ");
            int amount = input.nextInt();
            customers.addCustomer(new Customer(id, name, amount));
        }
        System.out.println("1. Display records\n2. update record\n3. exit\n\t enter choice ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                customers.displayCustomers();
                break;
            case 2:
                try {
                    System.out.println("Enter id of the record");
                    int id = input.nextInt();
                    System.out.println("Enter purchase amount");
                    int amount = input.nextInt();
                    Customer updatedCustomer = customers.updateCustomer(id, amount);
                    System.out.println("Updated customer "+updatedCustomer.toString());
                }
                catch (CustomerNotFoundException customerNotFoundException) {
                    System.out.println(customerNotFoundException.getMessage());
                }
                break;
            case 3:
                break;
        }
    }
}