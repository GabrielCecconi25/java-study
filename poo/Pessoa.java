package poo;

public class Pessoa extends Ser{

    public String sobrenome;


    public Pessoa(String nome, int idade, String sobrenome) {
        super(nome, idade);
        this.sobrenome = sobrenome;
    }

    @Override
    public String saudacao() {
        return "Ola, meu nome é " + this.nome;
    }


}
