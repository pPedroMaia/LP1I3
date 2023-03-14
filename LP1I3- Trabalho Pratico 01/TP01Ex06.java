import java.util.Scanner;

/* Pedro Maia
 *6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados.*/

public class TP01Ex06 {
 public static void main(String[] args) {
  System.out.println("Digite o valor 1: ");
  Scanner input = new Scanner(System.in);
  double v1 = input.nextDouble();

  System.out.println("Digite o valor 2: ");
  double v2 = input.nextDouble();

  System.out.println("Digite o valor 3: ");
  double v3 = input.nextDouble();

  System.out.println("Digite o valor 4: ");
  double v4 = input.nextDouble();

  double ma = (v1 + v2 + v3 + v4) / 4;

  System.out.println("A média é: " + ma); 
 }
}