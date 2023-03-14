import java.util.Scanner;

/* Pedro Maia
 *12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.*/

public class TP01Ex12 {
 public static void main(String[] args) {
  System.out.println("Digite o altura do cone: ");
  Scanner input = new Scanner(System.in);
  double a = input.nextDouble();
  
  System.out.println("Digite o raio do cone: ");
  double r = input.nextDouble();

  double pi = 3.14;

  double v = (pi * (r * r) * a) / 3;

  System.out.println("O volume é : " + v + "cm³"); 
 }
}