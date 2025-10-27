import java.util.Scanner;

public class OperadorNotCCompuesta {

    static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad= scanner.nextInt();

        System.out.println("¿eres estudiante? (true/flase)");
        boolean estudiante = scanner.nextBoolean();

        boolean menor26 = edad<26;
        boolean noEsEstudiante= !estudiante;


        boolean descuentoEstudiante = estudiante;
        boolean descuentoEspecial= menor26 && estudiante;
        boolean descuentoMasEspecial = menor26|| estudiante;

        System.out.println("¿Eres menor de 26 años?: "+menor26);
        System.out.println("¿Eres estudiante? "+estudiante);
        System.out.println("¿No eres estudiante? "+noEsEstudiante);
        System.out.println("Tienes descuento joven: "+menor26);
        System.out.println("Tienes descuento estudiante: "+estudiante);
        System.out.println("Tienenes descuento especial: "+descuentoEspecial);
        System.out.println("TIenes descuento especial (menor de edad 26 o estudiante: " +descuentoMasEspecial);

        scanner.close();






    }
}
