package semana06parte2.Banco;
// APAGAR TUDO O QUE TIVER CPF;
public class Pessoa {
//                             **********
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;//**
    }
    
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
//**
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    //abstract boolean validaDocumento(String documento);
    //**
    private boolean validaDocumento(String documento){
        //FAZER VALIDADOR DE CNPJ.
        // FAZER VALIDADOR DE CPF.
        return true;
    }
    private boolean validaCpf(String cpf){
        return true;
    }
}
