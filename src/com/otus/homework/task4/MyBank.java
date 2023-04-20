package com.otus.homework.task4;

import java.util.Set;

public class MyBank {

    public static void main(String[] args) {
        var bank = new Bank();
        Set<Account> accounts = bank.getAccount(new Client("Frida", 2));
        Set<Account> accounts2 = bank.getAccount(new Client("Arina", 17));
        System.out.println(accounts);
        System.out.println(accounts2);

        System.out.println(bank.findClient(new Account(1,10)));
    }


}
