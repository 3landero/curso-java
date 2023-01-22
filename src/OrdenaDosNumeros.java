import java.util.Scanner;

public class OrdenaDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();

        int numMayor = (num1 > num2) ? num1 : num2;
        int numMenor = (num2 < num1) ? num2 : num1;

        System.out.println("El orden va asi " +numMenor +" y despues "+ numMayor);

    }

}
