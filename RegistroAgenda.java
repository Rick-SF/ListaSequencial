package Exe_lista;

public class RegistroAgenda {
    public String nome;
    public String telefone;

    public RegistroAgenda (String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}