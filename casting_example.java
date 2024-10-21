package java1;

public class casting_example {
    public static void main (String[] args) {
        // Casting Implicito
            // int -> double (Aumenta bits)
            // char -> String
        int idade1 = 22;
        double idade2 = idade1;

        char letra1 = 'a';
        String nome = String.valueOf(letra1);




        // Casting Explicito
            // double -> int (Diminui bits)
            // String -> char
        idade1 = (int) idade2;
        
        letra1 = nome.charAt(0);

        // String e inteiro inteiro
        String nome2 = String.valueOf(idade1);
        idade1 = Integer.parseInt(nome2);
        System.out.println(nome2);
        System.out.println(idade1);

    }
}
