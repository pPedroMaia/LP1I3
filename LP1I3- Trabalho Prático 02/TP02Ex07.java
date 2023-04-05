/*
*7.Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
*digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
*valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.
*Pedro Maia
*/

import java.util.Scanner;


public class TP02Ex07 {
	public static void main(String[] args) {
		M m1 = new M();
		m1.FM();
		m1.MM();	
	}
}	

class M {
	Scanner s = new Scanner(System.in);
	int[][] ma = new int[3][4];
	int c;
	
	void FM() {
		for (int y = 0; y < 4; y++) {
			for (int x = 0; x < 3; x++) {
				System.out.println("Digite um número");
				ma[x][y] = s.nextInt();
			}
		}

		System.out.println("Digite ua constante multiplicativa");
		c = s.nextInt();	
		System.out.println("");

		for (int y = 0; y < 4; y++) {
			for (int x = 0; x < 3; x++) {
				ma[x][y] *= c;
			}
		}
	}
	
	void MM() {
		for (int y = 0; y < 4; y++) {
			for (int x = 0; x < 3; x++) {
				System.out.println(ma[x][y]);
			}
		}
	}
}