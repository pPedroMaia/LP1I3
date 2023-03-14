import java.util.Scanner;

/* Pedro Maia
 * 5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado.*/

public class TP01Ex05 {
 public static void main(String[] args) {
  System.out.println("Digite o diâmetro da esfera: ");
  Scanner input = new Scanner(System.in);
  double diametro = input.nextDouble();

  double pi = 3.14;
  double raio = diametro / 2;

  double volume = (4 * pi * (raio * raio * raio)) / 3;

  System.out.println("O volume da esfera é: " + volume + " cm³"); 
 }
}