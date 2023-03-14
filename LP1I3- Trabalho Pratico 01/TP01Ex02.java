import java.util.Scanner;

/* Pedro Maia
 * 2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado.*/

public class TP01Ex02 {
 public static void main(String[] args) {
  System.out.println("Digite o tamanho da aresta do quadrado: ");
  Scanner input = new Scanner(System.in);
  double aresta = input.nextDouble();

  double area = aresta * aresta;

  System.out.println("A área do quadrado é: " + area + " cm²"); 
 }
}