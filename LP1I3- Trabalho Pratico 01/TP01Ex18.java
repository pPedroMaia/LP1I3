import java.util.Scanner;

/* Pedro Maia
 *18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.*/

public class TP01Ex18 {
 public static void main(String[] args) {
  System.out.println("Digite o valor do 1º produto: ");
  Scanner input = new Scanner(System.in);
  double a = input.nextDouble();

  System.out.println("Digite o valor do 2º produto: ");
  double b = input.nextDouble();

  System.out.println("Digite o valor do 3º produto: ");
  double c = input.nextDouble();

  System.out.println("Digite o valor do 4º produto: ");
  double d = input.nextDouble();

  System.out.println("Digite o valor do 5º produto: ");
  double e = input.nextDouble();

  System.out.println("Digite o valor do seu pagamento: ");
  double x = input.nextDouble();

  double s = a + b + c + d + e;
  double t = x - s;

  System.out.println("Total: " + s);
  System.out.println("Troco: " + t); 
 }
}