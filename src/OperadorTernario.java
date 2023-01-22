import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        String estado = "";

        double matematicas = 0.0;
        double quimica = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese calificacion de Matematicas");
        matematicas = scanner.nextDouble();
        System.out.println("Ingrese calificacion de Quimica");
        quimica = scanner.nextDouble();
        System.out.println("Ingrese calificacion de Historia");
        historia = scanner.nextDouble();

        double promedio = (matematicas + quimica + historia) /3;

        estado = promedio >= 5.49 ? "Aprobado" : "Reprobado";
        System.out.println(estado);

    }
}
