public class EjemploString {
    public static void main(String[] args) {
        String curso1 = "Programacion Java";
        String curso2 = new String("Programacion Java");

        boolean esIgual = curso1 == curso2;
        System.out.println("esIgual = "+ esIgual);

        esIgual = curso1.equals(curso2);
        System.out.println("esIgual = " + esIgual);

    }
}
