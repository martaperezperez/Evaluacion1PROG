package Boletin17;

public class Boletin17 {
    public static void main(String[] args) {
        Boletins bo= new Boletins();
        ProbaPractica pra= new ProbaPractica();
        ProbasEscritas es=new ProbasEscritas();
        bo.Boletins();
        pra.amosarResultado();
        es.amosarNotas();

        System.out.println("Probas teóricas ")  ;
        es.calcularNotasProbasEscritas();
        System.out.println(" Probas Prácticas: ");
        pra.calcularNotaProbaPractica();
        System.out.println(" Boletins: ");
        bo.Boletins();
        System.out.println(" Nota total: ");
        bo.Boletins()+pra.calcularNotaProbaPractica()+es.calcularNotasProbasEscritas();



    }
}
