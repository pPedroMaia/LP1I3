import java.util.Scanner;

/* Pedro Maia
 *10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit.*/

public class TP01Ex10 {
 public static void main(String[] args) {
  System.out.println("Digite a temperatura em Celsius: ");
  Scanner input = new Scanner(System.in);
  double c = input.nextDouble();

  double f = (c * 1.8) + 32;

  System.out.println(c + "Celsium viram: " + f + " Fahrenheit"); 
 }
}