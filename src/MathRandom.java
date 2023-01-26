import java.util.Random;

public class MathRandom {
    public static void main(String[] args) {



        String[] colores = {"azul", "amarillo", "rojo", "ver+de", "blanco", "negro"};

        double aleatorio = Math.random();

        System.out.println("aleatorio = " + aleatorio);

        aleatorio *= colores.length;

        aleatorio = Math.floor(aleatorio);

        System.out.println("color es = " + colores[(int)aleatorio]);

        Random randomObj = new Random();

        System.out.println("randomObj = " + randomObj);

        int enteroRandom =15+ randomObj.nextInt(25-15);

        System.out.println("enteroRandom = " + enteroRandom);
    }
}
