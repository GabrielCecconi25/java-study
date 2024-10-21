package poo;

public class ProdutoTestar {

    public static void main(String[] args){
        // Construtor Padrão
        Produto p1 = new Produto();
        p1.nome = "Caneta Preta";
        p1.marca = "Bic";
        p1.valor = 1.50F;
        
        System.out.println("Nome:" + p1.nome + " Marca:" + p1.marca + " Valor:" + p1.valor);
        

        // Construtor de dois parâmetros
        Produto p2 = new Produto("Caneta Vermelha", "Faber");
        p2.valor = 1.69F;

        System.out.println("Nome:" + p2.nome + " Marca:" + p2.marca + " Valor:" + p2.valor);
        
        // Construtor de três parâmetros
        Produto p3 = new Produto("Borracha", "Mercur", 1.89F);

        System.out.println("Nome:" + p3.nome + " Marca:" + p3.marca + " Valor:" + p3.valor);
    }
}
