import java.util.Scanner;

public class ComparacionNumeros {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número");//lee el numero
        int num1 = scanner.nextInt();//lee numero entero

        //pedir segundo numero
        System.out.println("Introduce el segundo número");//lee el segundo numero
        int num2= scanner.nextInt();

        /*para los operadores lógicos que se ejecuten con variables se ha de poner: >,<,== si es igual, != si es diferente
        ,>=,<=
         */


        boolean respuesta= num1>num2;//es mayor
        System.out.println("¿"+num1+" es mayor a "+num2+"?"+respuesta);
        respuesta= num1<num2;//es menor
        System.out.println("¿"+num1+" es menor a "+num2+"?"+respuesta);
        respuesta= num1==num2;//es igual
        System.out.println("¿"+num1+" es igual a "+num2+"?"+respuesta);
        respuesta= num1!=num2;//es diferente
        System.out.println("¿"+num1+" es diferente a "+num2+"?"+respuesta);
        respuesta = num1>=num2;//mayor o igual
        System.out.println("¿"+num1+" es mayor o igual a "+num2+"?"+respuesta);
        respuesta = num1<=num2;//menos o igual
        System.out.println("¿"+num1+" es menor o igual a "+num2+"?"+respuesta);

        scanner.close();



    }
}
