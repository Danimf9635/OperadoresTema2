import java.util.Scanner;

public class OperadoresLogicosAndOr {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Introduce tu edad:");
        int edad= scanner.nextInt();

        System.out.println("Tienes carnet de conducir?");
        boolean carnet= scanner.nextBoolean();

        boolean manhor21anhos = edad>=21;
        System.out.println("Eres mayor a 21 años "+manhor21anhos);
        System.out.println("Tenes carnet "+carnet);
        boolean alquilar = manhor21anhos && carnet;
        System.out.println("Puedes alquilar un coche "+alquilar);

        scanner.close();


    }
}
