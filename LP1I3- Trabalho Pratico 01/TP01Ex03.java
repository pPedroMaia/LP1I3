import java.util.Scanner;

/* Pedro Maia
 * 3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.*/

public class TP01Ex03 {
 public static void main(String[] args) {
  System.out.println("Digite o tamanho da diagonal do quadrado: ");
  Scanner input = new Scanner(System.in);
  double diagonal = input.nextDouble();

  double area = (diagonal * diagonal) / 2;

  System.out.println("A área do quadrado é: " + area + " cm²"); 
 }
}