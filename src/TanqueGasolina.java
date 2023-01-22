import java.util.Scanner;

public class TanqueGasolina {
    public static void main(String[] args) {
        double maxDepot = 70.00;
        String[] levels = {"Tanque Lleno", "Tanque casi lleno", "Tanque 3/4", "Medio Tanque", "Suficiente", "Insuficiente", "Cantidad incorrecta"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los litros restante del tanque de gasolina");

        int tanqueDisponible = scanner.nextInt();

        String resultado = tanqueDisponible>70? levels[6] :
                tanqueDisponible == 70 ? levels[0] :
                    (tanqueDisponible >= 60) && (tanqueDisponible < 70) ? levels[1] :
                        tanqueDisponible >= 40 ? levels[2] :
                               tanqueDisponible >= 35  ? levels[3] :
                                     tanqueDisponible >= 20 ? levels[4] :
                                           tanqueDisponible >= 1 ? levels[5] :
                                                   tanqueDisponible < 0 ? "Numero debe ser positivo" : "Ingrese solo enteros";


        System.out.println("Nivel del tanque  " + resultado);

    }
}
