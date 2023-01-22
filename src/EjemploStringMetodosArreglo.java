public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        /*
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray  " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();

        for (int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i]);
        }*/

        String archivo=  "alguna.imagen.jpg";

        String[] archivoArr = archivo.split("[.]");
        int l = archivoArr.length;

        for (int i=0; i<l; i++){
            System.out.println(archivoArr[i]);
        }

        String extension = archivoArr[l-1];
        System.out.println(extension);


    }

}
