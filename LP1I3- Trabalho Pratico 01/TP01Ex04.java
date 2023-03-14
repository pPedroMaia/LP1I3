import java.util.Scanner;

/* Pedro Maia
 * 4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.*/

public class TP01Ex04 {
 public static void main(String[] args) {
  System.out.println("Altura do triângulo: 10cm ");
  System.out.println("Base do triângulo: 10cm");

  double base = 10;
  double altura = 10;
  
  double area = ( base * altura) / 2;

  System.out.println("A área do triângulo é: " + area + " cm²"); 
 }
}