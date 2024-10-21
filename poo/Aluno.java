package poo;

public class Aluno {
    
    private String nome;
    protected int idade;

    

    public void setIdade(int idade) {
        if (idade>0 && idade<130) {
            this.idade = idade;
            System.out.println("Idade cadastrada");
        } else {
            System.out.println("Erro! Idade é Inválida");
        }

    }

    public int getIdade() {
        return this.idade;
    }
}
