package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("AIB");

        if(bank.addBranch("Tullamore")){
            System.out.println("Tullamore Branch created");
        }

        bank.addCustomer("Tullamore", "Tim", 50.05);
        bank.addCustomer("Tullamore", "Joe", 175.34);
        bank.addCustomer("Tullamore", "Jenn", 220.12);

        bank.addBranch("Portlaoise");
        bank.addCustomer("Portlaoise", "Polly", 150.54);

        bank.addCustomerTransaction("Tullamore", "Tim", 44.22);
        bank.addCustomerTransaction("Tullamore", "Joe", 12.44);
        bank.addCustomerTransaction("Tullamore", "Tim", 1.65);

        bank.listCustomers("Tullamore", true);

        if(!bank.addCustomer("Donegal", "Brian", 5.53)){
            System.out.println("Error! Donegal branch does not exist");
        }

        if(!bank.addBranch("Tullamore")){
            System.out.println("Error! Tullamore branch already exists");
        }

        if(!bank.addCustomerTransaction("Tullamore", "Fergus", 52.33)){
            System.out.println("Error! Customer does not exist at Tullamore Branch");
        }

        if(!bank.addCustomer("Tullamore", "Tim", 12.21)){
            System.out.println("Error! Customer Tim already exists");
        }
    }
}
