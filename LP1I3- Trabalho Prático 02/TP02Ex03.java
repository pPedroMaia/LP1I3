/*3.Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
*números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
*satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
*digitação dos “N” valores, exibir:
*a. O maior valor;
*b. O menor valor;
*c. A soma dos valores;
*d. A média aritmética dos valores;
*e. A porcentagem de valores que são positivos;
*f. A porcentagem de valores negativos;
*Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
*programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o
*programa em função dessa resposta.
*Pedro Maia
*/

import java.util.Scanner;


public class TP02Ex03 {   
    public static void main(String[] args) {
        V a1 = new V();
        a1.C();
    }  
}

class V{   
    int[] va = new int[20];
    int e;
    int ma = 0, me = 0, s = 0; 
    double p = 0, n = 0, q = 0, med;
    int co = 0;    
    public void C() {
        Scanner t = new Scanner(System.in);       
        do {
            System.out.println("Digite um número: ");
            va[co] = t.nextInt();             
            if (ma < va[co]) {
                ma = va[co];
            }
            if (me > va[co]) {
                me = va[co];
            }
            s += va[co];
            q++;            
            if (va[co] >= 0) {
                p++;
            }
            if (va[co] < 0) {
                n++;
            }
            co++;
            System.out.println("Deseja continuar? (0 = não; 1 = sim)"); 
            e = t.nextInt();       
            if (co >= 20) {
                System.out.println("Números demais!");
		    System.out.println("");	
                e = 0;
            }           
        } while(e != 0);      
        med = s/q;
        n = n/q;
        p = p/q;  
        System.out.println("Maior " + ma);  
        System.out.println("Menor " + me);  
        System.out.println("Soma " + s);  
        System.out.println("Media " + med);  
        System.out.println("Positivos " + p);  
        System.out.println("Negativos " + n);
        
    }
}