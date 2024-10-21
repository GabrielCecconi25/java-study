package java1;

public class loop_example {
    public static void main (String[] args) {
        byte idade = 10;
        for(var i = 0; i < idade; i++) {
            System.out.println("oi");
        }
        byte i = 0;
        while(i < idade){
            i++;
            System.out.println(i);
        }
    }
}