import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la primer persona");
        String nombre1 = entrada.nextLine();
        String word1 = formateaNombre(nombre1);

        System.out.println("ingrese el nombre de la segunda persona");
        String nombre2 = entrada.nextLine();
        String word2 = formateaNombre(nombre2);

        System.out.println("ingrese el nombre de la tercera persona");
        String nombre3 = entrada.nextLine();
        String word3 = formateaNombre(nombre3);



        StringBuilder sb = new StringBuilder(word1);
                sb.append("_");
                sb.append(word2);
                sb.append("_");
                sb.append(word3);

        System.out.println("sb = " + sb);

    }

    public static String formateaNombre(String nombre) {
        char[] newArray = nombre.toCharArray();
        int wordLength = newArray.length;
        String secondChar = String.valueOf(newArray[1]).toUpperCase();

        String endingString1 = String.valueOf(newArray[wordLength-2]);
        String endingString2 = String.valueOf(newArray[wordLength-1]);
        String secondWordElement = endingString1.concat(endingString2);
        return secondChar +"."+ secondWordElement;
    }
}

/*

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre de un familiar:");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

        System.out.println(resultado);
    }
}
 */
