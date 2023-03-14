import java.util.Scanner;

/* Pedro Maia
 *15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).*/

public class TP01Ex15 {
 public static void main(String[] args) {
  System.out.println("cotação do dolar: ");
  Scanner input = new Scanner(System.in);
  double cd = input.nextDouble();
  
  System.out.println("Quantidade em Dólares: ");
  double d = input.nextDouble();

  double r = d * cd;

  System.out.println(d + "O dólar virou: " + r + "R$"); 
 }
}