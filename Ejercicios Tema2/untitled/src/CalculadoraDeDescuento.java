import java.util.Scanner;

public class CalculadoraDeDescuento {

    static void main(String[] args) {

        // Inicializar Scanner para leer la entrada del usuario
        Scanner scanner= new Scanner(System.in);

        //Precio producto
        System.out.println("Introducir el precio del producto");
        int producto= scanner.nextInt();

        //Precio porcentaje
        System.out.println("introducir precio porcentaje");
        int porcentaje = scanner.nextInt();

        //CALCULOS

        double descuento = (double) producto*porcentaje/100.0;
        double precioFinal = producto - descuento;

        //IMPRIMIR EN CONSOLA
        System.out.printf("Precio original: %.2f€\n", (double) producto);
        System.out.printf("Descuento (%d%%): %.2f€\n",porcentaje,(double)producto);
        System.out.printf("Precio Final: %.2f€\n",precioFinal);
        scanner.close();

    }
}
