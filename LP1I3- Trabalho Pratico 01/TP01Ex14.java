import java.util.Scanner;

/* Pedro Maia
 *14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados.*/

public class TP01Ex14 {
 public static void main(String[] args) {
  System.out.println("Digite o raio da esfera: ");
  Scanner input = new Scanner(System.in);
  double r = input.nextDouble();
  
  System.out.println("Digite a aresta da esfera: ");
  double a = input.nextDouble();

  double vc = Math.pow(a,3);
  double ve = (4/3) * Math.PI * Math.pow(r, 3);
  double vl = vc - ve;

  System.out.println("O volume livre do ambiente é: " + vl + "cm³"); 
 }
}