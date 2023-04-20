package com.otus.homework.task4;

import java.util.*;

public class Bank {
    HashMap<Client, Set<Account>>map = new HashMap<>();

    public Bank() {
        // Client frida2 = new Client ("Frida", 2);
        Client frida = new Client("Frida", 2);
        Client arina = new Client("Arina", 17);
        Account arinaAccount = new Account(2, 15);
        Account fridaAccount = new Account(1, 10);
        Set<Account> fridaAccounts = new HashSet<>();
        fridaAccounts.add(fridaAccount);
        Set<Account> arinaAccounts = new HashSet<>();
        arinaAccounts.add(arinaAccount);

        map.put(frida, fridaAccounts);
        map.put(arina, arinaAccounts);

    }

    Set<Account> getAccount(Client client) {
        return map.get(client);

    }
    Client findClient(Account account){
        for (var entry : map.entrySet() ) {
           if ( entry.getValue().contains(account) ){
               return entry.getKey();
           }

        }
        return null;


    }

    public static void main(String[] args) {


    }
}
