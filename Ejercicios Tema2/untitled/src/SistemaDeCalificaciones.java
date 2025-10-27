import java.util.Scanner;

public class SistemaDeCalificaciones {

    static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //datos con una variable envolvente utilizando la clase Scanner para crear un programa

        System.out.println("Introduce la nota del primer examen: ");
        int primerExamen = scanner.nextInt();
        System.out.println("Introduce la nota del segundo examen: ");
        int segundoExamen = scanner.nextInt();
        System.out.println("Introduce la nota del tercero examen: ");
        int tercerExamen = scanner.nextInt();

        //CALCULOS , nos pide la nota media en decimal
        double notaMedia = (double) (primerExamen + segundoExamen + tercerExamen)/ 3.0;

        //Booleanos si has aprobado
        boolean aprobado = (notaMedia >= 5);

        //Boleano si tienes notable
        boolean notable = (notaMedia>=7)&&(notaMedia<9);

        //boleano si tienes sobresaliente
        boolean sobresaliente = notaMedia>=9;


        //IMPRIMIMOS POR CONSOLA

        System.out.printf("Nota media: %.1f\n",notaMedia);
        System.out.println("¿Ha aprobado? "+aprobado);
        System.out.println("¿Tiene notable? "+notable);
        System.out.println("¿Tiene sobresaliente? "+sobresaliente);
        scanner.close();
    }
}
