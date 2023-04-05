/*2.Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
*erro, se necessário. Após a digitação, exibir:
*a. O maior valor;
*b. A soma dos valores;
*c. A média aritmética dos valores.
*Pedro Maia
*/

import java.util.Scanner;

public class TP02Ex02 {
    public static void main (String[] args){
    Scanner t = new Scanner(System.in);
    
    int[] n = new int[11];          
    int ma = 0;
    int s = 0;
    int me;
    
    System.out.println("Digite dez números positivos e inteiro: ");
    
   
    for (int i=1; i<11; i++){
        
    n[i] = t.nextInt(); 
    
        if(n[i] < 1){
        System.out.println("Digite um valor positivo e inteiro. ");
        i--;
        }
        
        else{
            if(n[i] > ma){
            ma = n[i];
            }
        }
        
    s = s + n[i];
    
    }
    
    System.out.println("Maior número: " + ma);
    System.out.println("A média é igual a: " + s/10);
    }   
}