package com.company;

import java.math.BigDecimal;

public class JavaMoney {
    @Override
    public int hashCode() { return super.hashCode(); }

    @Override
    public boolean equals(Object obj) { return super.equals(obj); }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "JavaMoney{" + "amount=" + amount + ", currency=" + currency + "}";
    }

    public JavaMoney(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    private int amount;
    private String currency;

    public int getAmount() { return amount; }
    public String getCurrency() { return currency; }

    public static void main(String[] args) {
        Money money = new Money(new BigDecimal(100), "$");
        BigDecimal val = money.getAmount();
    }
}