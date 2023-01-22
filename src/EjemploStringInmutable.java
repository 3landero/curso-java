public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso1 = "Programacion Java";
        String profesor = "Andres Guzman";

        curso1.concat(profesor);

         String resultado2 = curso1.transform((c)->{
             return c + " con " + profesor;
         });

        System.out.println("resultado2 = " + resultado2);


    }
}
