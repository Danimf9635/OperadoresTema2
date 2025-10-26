import java.util.Scanner;

public class OperadoresAritmeticos {

    static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Introduce el primer Número:");
        int num1= scanner.nextInt();//lee el numero entero

        //Pedir el segundo número
        System.out.println("Introduce el segundo Número:");
        int num2= scanner.nextInt();//lee el segundo numero
        System.out.println();

        //Realizamos las opraciones aritmeticas
        int suma= num1+num2;
        int resta= num1-num2;
        int multiplacicion= num1*num2;
        double division=(double) num1/num2;
        double modulo= (double) num1%num2;
        //Mostrar resultados por consola
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplacicion);
        System.out.println(division);
        System.out.println(modulo);
        scanner.close();
    }

}
