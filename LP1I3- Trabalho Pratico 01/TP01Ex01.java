import java.util.Scanner;

/* Pedro Maia
 * 1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área.*/

public class TP01Ex01 {
 public static void main(String[] args) {
  System.out.println("Digite a base do retângulo: ");
  Scanner input = new Scanner(System.in);
  double base = input.nextDouble();


  System.out.println("Digite a altura do retângulo: ");
  double altura = input.nextDouble();

  double area = base * altura;

  System.out.println("A área do retângulo é: " + area + " cm²"); 
 }
}