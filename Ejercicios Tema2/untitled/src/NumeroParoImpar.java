import java.util.Scanner;

public class NumeroParoImpar {
    static void main(String[] args) {
        //defino Objeto Scanner/clase
        Scanner scanner= new Scanner(System.in);

        System.out.println("Introduce numero");
        int numero= scanner.nextInt();
        int resto= numero%2;

        if(resto==0) {
            System.out.println("Es número "+numero+ " es par(resto al dividir entre 2: "+resto);

        }else {
            System.out.println("El numero "+numero+ "es impar(resto al dividir entre 2 "+resto);
        }
    scanner.close();

    }
}
