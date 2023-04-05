/*
*8.Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
*digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
*valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
*correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
*colunas.
*Pedro Maia
*/

import java.util.Scanner;

public class TP02Ex08 {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    
    int ma[][] = new int [3][4];
    int a;
    int b, c = 0;
    
    System.out.println("Digite doze valores: ");
    
    for(b=0; b<3; b++){
        for(c=0; c<4; c++){
            ma[b][c] = s.nextInt(); 
        }
    }
   
    System.out.println("Digite uma constante para multiplicar a matriz: ");
    a = s.nextInt();
    
    for(b=0; b<3; b++){
        for(c=0; c<4; c++){
            System.out.print(ma[b][c]*a + " ");
        }
        System.out.println("");
    }
    }
}