import java.util.Scanner;

/* Pedro Maia
 *11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.*/

public class TP01Ex11 {
 public static void main(String[] args) {
  System.out.println("Digite o diâmetro do ciruclo: ");
  Scanner input = new Scanner(System.in);
  double d = input.nextDouble();

  double pi = 3.14;

  double a = (pi * (d * d)) / 4;

  System.out.println("A área é : " + a + "cm²"); 
 }
}