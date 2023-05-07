/*Pedro Henrique de Oliveira Maia dos Santos CB3013197
*
*/

public class TestaHora {
    public static void main(String[] args) {
        Hora a = new Hora();
        Hora b = new Hora(12, 30, 30);

        System.out.println(a.getHor() + " " + a.getMin() + " " + a.getSeg());
        System.out.println(b.getHora1());

        a.setHor();
        a.setMin();
        a.setSeg();

        b.setHor(23);
        b.setMin(40);
        b.setSeg(50);

        System.out.println(a.getHora2());
        System.out.println(b.getHora1());

        System.out.println(a.getSecundos());
    }
}