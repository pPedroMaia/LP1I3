/*
*4.Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.
*Pedro Maia
*/

import java.util.Scanner;

public class TP02Ex04 {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    
    int a[][] = new int[2][3];
    int b, c = 0;
    
    System.out.println("Digite seis números: ");
    
    for(b=0; b<2; b++){
        for(c=0; c<3; c++){
            a[b][c] = s.nextInt();
        }
    }
    
    for(b=0; b<2; b++){
        for(c=0; c<3; c++){
            System.out.print(a[b][c]);
        }
        System.out.println("");
    }
    
    }
}
