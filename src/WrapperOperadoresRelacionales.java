public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1  == num2));

        num1 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1  == num2));

        System.out.println("Tienen el mismo valor? " + (num1.equals(num2)));
        System.out.println("y Ahora valen igual? " + (num1.intValue() == num2.intValue()));
        //-- lo anterior aplica a numeros mayores a 128
        //-- porque Java hasta el num 127 evalua siempre por valor y no por la instancia

    }
}
