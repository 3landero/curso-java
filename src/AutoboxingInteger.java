public class AutoboxingInteger {
    public static void main(String[] args) {
        // Estamos automaticamente convirtiendo primitivos en valores de referencia
        // como si usaras el metodo .valueOf( ) en cada elemento
        Integer[] enteros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        int suma=0;

        for (Integer num: enteros
             ) {
            if (num.intValue()%2 == 0) {
                suma+= num.intValue();
            }
        }
        System.out.println("suma = " + suma);

        for (Integer num: enteros
        ) {
            if (num %2 == 0) {
                suma+= num;
            }
        }
        System.out.println("suma = " + suma);
    }
}
