public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        //-- este operador de comparacion solo debe usarse en valores primitivos
        boolean  b1 = i == j;
        System.out.println("b1 = " + b1); //-- true

        //-- este operador revierte el valor booleano de una variable
        boolean b2 = !b1;
        System.out.println("b2 = " + b2);

        //-- este operador evalua si es diferente una variable de otra
        boolean b3 = b1 != b2;
        System.out.println("b3 = " + b3);




    }
}
