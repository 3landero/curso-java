public class SentenciaWhile {
    public static void main(String[] args) {

        boolean prueba = true;
        int i = 0;
        do{
            if (i==10) {
                prueba = false;
            }

            System.out.println("i = " + i);
            i++;

        } while (prueba);




    }
}
