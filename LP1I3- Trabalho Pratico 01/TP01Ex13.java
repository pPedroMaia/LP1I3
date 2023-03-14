import java.util.Scanner;

/* Pedro Maia
 *13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
(em s) que serão digitados.*/

public class TP01Ex13 {
 public static void main(String[] args) {
  System.out.println("Digite a velocidade inicial (m/s): ");
  Scanner input = new Scanner(System.in);
  double vi = input.nextDouble();
  
  System.out.println("Digite a aceleração(m/s²): ");
  double a = input.nextDouble();

  System.out.println("Digite o tempo percorrido(s): ");
  double t = input.nextDouble();

  double vf = vi + (a * t);

  System.out.println("A velocidade final é : " + vf + "m/s"); 
 }
}