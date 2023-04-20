package com.otus.homework.task4;

import java.util.Objects;

public class Account {
    int id;
    int gold;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", gold=" + gold +
                '}';
    }

    public Account(int id, int gold){
        this.id = id;
        this.gold = gold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && gold == account.gold;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gold);
    }
}
