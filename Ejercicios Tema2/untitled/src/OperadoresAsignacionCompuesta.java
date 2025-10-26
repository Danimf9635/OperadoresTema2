import java.util.Scanner;

public class OperadoresAsignacionCompuesta {

    static void main(String[] args) {

        //defino el objeto scanner
        Scanner scanner= new Scanner(System.in);//para inciar el programa donde el usuario pueda intereactuar
        //Pido al usuario que ingrese el valor inicial
        System.out.println("Valor inicial");
        int numero= scanner.nextInt();

        numero +=50;
        System.out.println("Despues de sumar 50 (+=): "+numero);
        numero-=30;
        System.out.println("Despues de restar 30 (-=) "+numero);
        numero*=2;
        System.out.println("Despues de multiplicar por 2 (*=) "+numero);
        numero/=4;
        System.out.println("despues de dividir entre 4 (/=) "+numero);
        scanner.close();


    }
}


