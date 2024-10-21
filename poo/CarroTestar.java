package poo;

public class CarroTestar {
    public static void main (String[] args){
        Carro carro1 = new Carro();
    
        carro1.nome = "Uno";
        carro1.marca = "Fiat";
        carro1.ano = 2015;
        carro1.vel = 40;
        System.out.println(carro1.vel);

        carro1.velAumentar(20);
        System.out.println(carro1.vel);

        carro1.velDiminuir(10);
        System.out.println("Velocidade Atual: " + carro1.vel + "km/h");
    }

}