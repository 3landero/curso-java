import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero entero");
//        String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;

        try {
            numeroDecimal = scanner.nextInt();  //Integer.parseInt(numeroStr);

        }catch (Exception e) {
            System.out.println("Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("Numero decimal = " + numeroDecimal);

        String resultadoBinario = "numero Binario de "+ numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        System.out.println(mensaje);


    }
}