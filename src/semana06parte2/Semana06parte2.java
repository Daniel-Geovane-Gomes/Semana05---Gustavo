package semana06parte2;

import java.util.ArrayList;
import semana06parte2.Banco.Conta;
import semana06parte2.Banco.Pessoa;

public class Semana06parte2 {

    public static void main(String[] args) {
        ArrayList<Conta> banco = new ArrayList<>();
        
        Pessoa pUm = new Pessoa("Gustavo", "999.999.999.-99");
        Pessoa pDois = new Pessoa("Maçanero", "888.888.888-88");
        Pessoa pTres = new Pessoa("Filipe", "777.777.777-77");
        
        banco.add(new Conta(pUm));
        banco.add(new Conta(pDois));
        banco.add(new Conta(pTres));
        
        banco.get(0).depositar(1000.0);
        
        for(Conta conta : banco){
            System.out.println(conta.getTitular().getNome());
            conta.depositar(100.0);
            System.out.println("");
            //System.out.println(conta.getNumero() + " - " + conta.getTitular().getNome());
        }
        
        banco.get(0).sacar(500.0);
        banco.get(2).sacar(80.0);
    }
    
}
