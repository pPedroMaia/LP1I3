/*1.Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
*Caso contrário solicitar novamente apenas o segundo valor.
*Pedro Maia
*/

import java.util.Scanner;

class E {
    public int v1;
    public int v2;
    
    
    
    public void V() {
        Scanner t = new Scanner(System.in);
        
    do {
            System.out.print("Digite o primeiro valor: ");
            v1 = t.nextInt();
            System.out.print("Digite o segundo valor (maior que o primeiro): ");
            v2 = t.nextInt();
        } 
        while (v1 > v2);
        System.out.println("O segundo é maior que o primeiro!");
}
     
}

public class TP02Ex01 {
   
    public static void main(String[] args) {
        E p1 = new E();
        p1.V();
    }
}