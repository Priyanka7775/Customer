package main;

import data.Customer;

public class CustomerImpl {
    public static void main(String[] args) {
        Customer obj1=new Customer();
        obj1.setName("Ramesh");
        obj1.setEmail("ramesh123@gmail.com");
        obj1.setAddress("Mumbai");
        obj1.setMobileNo(123456789);

        System.out.println("obj1.getName() = " + obj1.getName());
        System.out.println("obj1.getAddress() = " + obj1.getAddress());
        System.out.println("obj1.getMobileNo() = " + obj1.getMobileNo());
        System.out.println("obj1.getEmail() = " + obj1.getEmail());
        System.out.println("obj1.isPremiumMembership() = " + obj1.isPremiumMembership());


        System.out.println();

        Customer obj2=new Customer();
        obj2.setName("Suresh");
        obj2.setEmail("suresh123@gmail.com");
        obj2.setAddress("Delhi");
        obj2.setMobileNo(987654321);

        System.out.println("obj2.getName() = " + obj2.getName());
        System.out.println("obj2.getAddress() = " + obj2.getAddress());
        System.out.println("obj2.getMobileNo() = " + obj2.getMobileNo());
        System.out.println("obj2.getEmail() = " + obj2.getEmail());
        System.out.println("obj2.isPremiumMembership() = " + obj2.isPremiumMembership());



    }
}
