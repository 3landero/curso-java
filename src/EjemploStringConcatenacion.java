public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso1 = "Programacion Java";
        String profesor = "Andres Guzman";

        String detalle = curso1 + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + (numeroA + numeroB));

        String detalle2 = curso1.concat(" con ".concat(profesor));
        System.out.println(detalle2);

    }
}
