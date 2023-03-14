import java.util.Scanner;

/* Pedro Maia
 *16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos.*/

public class TP01Ex16 {
 public static void main(String[] args) {
  System.out.println("Digite o valor do ângulo em graus: ");
  Scanner input = new Scanner(System.in);
  double a = input.nextDouble();

  double ar = Math.toRadians(a);

  double s = Math.sin(ar);
  double c = Math.cos(ar);
  double t = Math.tan(ar);
  double sc = 1 / Math.cos(ar);

  System.out.println("Seno: " + s + ", Cosseno: " + c + ", Tangente: " + t + ", Secante: " + sc); 
 }
}