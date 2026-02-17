package com.example;

public class CuentaBancaria {
    private String titular;
    private Double saldo;

    public CuentaBancaria(String titular, Double saldoInicial){
        if (saldoInicial < 0){
            saldoInicial = 0;
        }
    }

    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titulo) {
        this.titular = titular;
    }

    public Double getSaldo(){
        return saldo;
    }

    public void depositar(double cantidad){
        if (cantidad > 0){
            saldo = saldo + cantidad;
        }

    }

    public void retirar(double cantidad){
        if (cantidad > 0){
            saldo = saldo - cantidad;
        }
    }

}
