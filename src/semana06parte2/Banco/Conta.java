package semana06parte2.Banco;

import java.util.Random;

public class Conta {

    public Conta(Pessoa titular) {

        this.titular = titular;
        //this.saldo = saldo;
    }
    
    
    
    private int numero;
    private Pessoa titular;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.printf("Saldo depósito: R$%.2f", this.saldo);
        } else{
            System.out.println("O valor é inválido");
        }
    }
    
    public void sacar(double valor){
        if(valor <= this.saldo && valor > 0){
            this.saldo -= valor;
            System.out.printf("Saldo após saque: R$%.2f", this.saldo);
            System.out.println("");
        } else {
            System.out.println("Valor inválido ou insuficiente para Sacar");
        }
    }
    
    public void transferir(Conta destinatario, double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
            System.out.printf(this.titular.getNome() + "Saldo após transferência: R$%.2f", this.saldo);
            System.out.println("");
            destinatario.saldo += valor;
            System.out.printf(destinatario.getTitular().getNome() + "Saldo após transferência: R$%.2f", destinatario.getSaldo());
            System.out.println("");
        } else {
            System.out.println("Saldo insuficiente!");
        }
        
        
    }
    
    private int gerarNumeroConta(){
        Random random = new Random();
        
        return random.nextInt(90000) + 10000;
    }
}
