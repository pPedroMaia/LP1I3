import java.util.Scanner;

/* Pedro Maia
 *9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.*/

public class TP01Ex09 {
 public static void main(String[] args) {
  System.out.println("Digite da resistência elétrica: ");
  Scanner input = new Scanner(System.in);
  double re = input.nextDouble();

  System.out.println("Digite da corrente elétrica: ");
  double ce = input.nextDouble();

  double t = re / ce;

  System.out.println("A tensão é: " + t + "V"); 
 }
}