package com.otus.homework.task4;

import java.util.Objects;

public class Client {
    String name;
    int age;

    public boolean equals(Object o){
        System.out.println("equals called"+ name);
        if (this == o) return true; // Object o это Kate2
        if (o == null || getClass() != o.getClass()) return false; //getClass берем класс human
        Client client = (Client) o;
        return Objects.equals(name, client.name)&& Objects.equals(age,client.age);
    }
    public int hashCode() {
        System.out.println("hashcode called"+ name + age);
       // return Objects.hashCode(name) + Objects.hashCode(age);
        return Objects.hash(name,age);
    }

    public Client(String name,int age)
    {
        this.name= name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
