import java.util.Scanner;

/* Pedro Maia
 *7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.*/

public class TP01Ex07 {
 public static void main(String[] args) {
  System.out.println("Digite o valor 1: ");
  Scanner input = new Scanner(System.in);
  double v1 = input.nextDouble();

  System.out.println("Digite o valor 2: ");
  double v2 = input.nextDouble();

  double mg = Math.sqrt(v1 * v2);

  System.out.println("A média é: " + mg); 
 }
}