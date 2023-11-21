package Entities;

import java.util.Date;
public class Person {
    protected String name;
    protected Date birth;
    protected Double income;
    private Double balance, saldo, depositar, sacar, calcular_saldo;

    public Person() {
        String name;
        Date birth;
        Double income;
        Double balance, saldo, depositar, sacar, calcular_saldo;
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

    public Double getDepositar() {
        return depositar;
    }

    public void setDepositar(Double depositar) {
        this.depositar = depositar;
    }

    public Double getSacar() {
        return sacar;
    }

    public void setSacar(Double sacar) {
        this.sacar = sacar;
    }

    public Double getCalcular_saldo() {
        return calcular_saldo;
    }

    public void setCalcular_saldo(Double calcular_saldo) {
        this.calcular_saldo = calcular_saldo;
    }
    public void calcular_saldo(){
        calcular_saldo = (balance + depositar) - sacar;
    }
}



