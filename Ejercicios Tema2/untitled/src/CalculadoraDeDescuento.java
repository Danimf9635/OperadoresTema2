import java.util.Scanner;

public class CalculadoraDeDescuento {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio del producto");
        int producto = scanner.nextInt();
        System.out.println("\n Introduce el porcentaje de descuento");
        int porcentaje = scanner.nextInt();

        double productoDouble=producto;
        System.out.println("precio original "+productoDouble);

        double pocentajeDouble= productoDouble%20;
        System.out.println("Descuento (20%) "+pocentajeDouble);
        double precioFinal= pocentajeDouble%productoDouble;
    }
}
