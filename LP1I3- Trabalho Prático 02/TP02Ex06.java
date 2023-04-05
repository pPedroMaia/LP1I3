/*
*6.Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
*Pedro Maia
*/

import java.util.Scanner;

public class TP02Ex06 {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    
    String a[][] = new String [2][3];
    int b, c = 0;
    
    System.out.println("Digite seis nomes: ");
    
    for(b=0; b<2; b++){
        for(c=0; c<3; c++){
            a[b][c] = s.next();
        }
    }
    
    for(b=0; b<2; b++){
        for(c=0; c<3; c++){
            System.out.print(a[b][c] + " ");
        }
        System.out.println("");
    }
    
    }
}