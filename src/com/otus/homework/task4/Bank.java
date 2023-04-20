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


        /*if (frida.equals(frida2)) { // str != str2 / str == str3 в примитивах нету методов
            System.out.println("it's correct");
        } else {
            System.out.println("it's incorrect");
        }

        //map.entrySet();


        for (int i = 0; i < map.get(frida2).size();i++){ // i < fridaAccounts.size()
            System.out.println(map.get(frida2).get(i).id); //(fridaAccounts.get(i).id)
        }
    }// узнать есть ли этот аккаунт в списке/массиве

    //https://www.baeldung.com/java-map-entry

         */
    }
}
