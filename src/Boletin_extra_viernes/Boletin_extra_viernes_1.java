package Boletin_extra_viernes;

public class Boletin_extra_viernes_1 {
    public static void main(String[] args) {

        int IVE;
        Scanner cs= new Scanner(System.in);
        System.out.println("Nome da prenda:");
        String prenda= cs.nextLine();
        System.out.println("Prezo da prenda:");
        int prezo= cs.nextInt();

        IVE=(25*prezo)/100;
        System.out.println("a prenda: " + prenda + " ten un prezo final de:"+ IVE);
    }
}
}
