import java.util.Scanner;

/* Pedro Maia
 *8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.*/

public class TP01Ex08 {
 public static void main(String[] args) {
  System.out.println("Digite o valor em milhas marítimas: ");
  Scanner input = new Scanner(System.in);
  
  double mm = input.nextDouble();

  double m = mm * 1852;
  
  double q = m / 1000;

  System.out.println(mm + " milhas maritimas viram: " + q + "km"); 
 }
}