import java.util.Scanner;

/* Pedro Maia
 *17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.*/

public class TP01Ex17 {
 public static void main(String[] args) {
  System.out.println("Digite o valor de X: ");
  Scanner input = new Scanner(System.in);
  double x = input.nextDouble();

  System.out.println("Digite o valor de Y: ");
  double y = input.nextDouble();


  double xy = Math.pow(x,y);

  System.out.println("O X elevado a Y fica: " + xy); 
 }
}