package com.company;

public class Main {

    public static void main(String[] args) {
	    Account bobsAccount = new Account(
                "12345",
                0.00,
                "Bob Brown",
                "bob@test.com",
                "(087) 123-4567"
        );


        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50d);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51d);
        bobsAccount.withdrawal(100.0);

        Account gustavosAccount = new Account("Gustavo", "gustavo@test.com", "12345-12341");
        System.out.println(gustavosAccount.getNumber() + " name " + gustavosAccount.getCustomerName());

        VipCustomer gustavoVip = new VipCustomer();
        System.out.println("gustavo vip credit limit = " + gustavoVip.getCreditLimit());
        System.out.println("gustavo vip name = " + gustavoVip.getName());

        VipCustomer isabelaVip = new VipCustomer("Isabela Soares de Sousa", "isabela@test.com");
        System.out.println("isabela vip credit limit = " + isabelaVip.getCreditLimit());
        System.out.println("isabela vip email = " + isabelaVip.getEmailAddress());
        System.out.println("isabela vip name = " + isabelaVip.getName());

        VipCustomer karineVip = new VipCustomer("Karine Soares", 5000.00, "karine@test.com");
        System.out.println("karineVip vip credit limit = " + karineVip.getCreditLimit());
        System.out.println("karineVip vip email = " + karineVip.getEmailAddress());
        System.out.println("karineVip vip name = " + karineVip.getName());

    }
}
