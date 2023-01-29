package manoj;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



class test {
    public static void main(String[] args) {
        System.out.println("enter no. of customers");
        Scanner scanner = new Scanner(System.in);
        int noOfCustomers = scanner.nextInt();
        List<Customer> customerList = new ArrayList<>();
        for(int i=0;i<noOfCustomers;i++){
            System.out.println("enter id");
            int id = scanner.nextInt();
            System.out.println("enter name");
            String name = scanner.nextLine();
            System.out.println("enter purchaseAmount");
            double amount = scanner.nextInt();
            customerList.add(new Customer(id,name,amount));
        }
        while(true){
            System.out.println("enter your choice");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    showCustomer(customerList);
                    break;
                case 2:
                    System.out.println("enter id");
                    int id = scanner.nextInt();
                    System.out.println("enter updatedAmount");
                    double amount = scanner.nextInt();
                    updateAmount(id,amount,customerList);
                    break;
                case 3:


                    break;
                default:
                    System.out.println("invalid choice");
            }
        }
    }
    static void showCustomer(List<Customer> customerList){
        List<Customer> customers = new ArrayList<>(customerList);
        customers.sort(Comparator.comparing(Customer::getPurchaseAmount,Comparator.reverseOrder()));
        customers.forEach(customer -> System.out.println(customer.toString()));
    }

    static void updateAmount(int id,double amount,List<Customer> customerList){
        for(Customer customer:customerList){
            if(customer.getId().equals(id)){
                customer.setPurchaseAmount(customer.getPurchaseAmount() + amount);
                return;
            }
        }
        throw new NotFoundException(id);
    }
}

class NotFoundException extends RuntimeException{
    NotFoundException(int id){
        super(String.format("Id %s Not Found in the list",id));
    }
}



class Customer {
    private Integer id;
    private String name;
    private Double purchaseAmount;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", purchaseAmount=" + purchaseAmount +
                '}';
    }

    public Customer() {}

    public Customer(Integer id, String name, Double purchaseAmount) {
        this.id = id;
        this.name = name;
        this.purchaseAmount = purchaseAmount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(Double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
}