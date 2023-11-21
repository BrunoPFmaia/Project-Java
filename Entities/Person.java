package Entities;

import java.util.Date;
public class Person {
    protected String name;
    protected Date birth;
    protected Double income;
    private Double balance, saldo, deposito, sacar;

    public Person() {
        String name;
        Date birth;
        Double income;
        Double balance, saldo, deposito, sacar;
    }

    @Override
    public String toString() {
        return name + birth + income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getDeposito() {
        return deposito;
    }

    public void setDeposito(Double deposito) {
        this.deposito = deposito;
    }

    public void depositar(){
        this.balance = this.balance + this.deposito;
    }

    public Double getSacar() {
        return sacar;
    }

    public void setSacar(Double sacar) {
        this.sacar = sacar;
    }
}



