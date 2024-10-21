package poo;

public class Carro {
    String nome;
    String marca;
    int ano;
    int vel;

    void velAumentar(int valor) {
        this.vel += valor;
    }

    void velDiminuir(int valor) {
        this.vel -= valor;
    }

    void buzinar() {
        System.out.println("biiiiiiiiiiii");
    }
}