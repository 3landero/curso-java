public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primboolean = num1 > num2; //-- false
        Boolean objBoolean = Boolean.valueOf(primboolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = false;

        System.out.println("primboolean = " + primboolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        System.out.println("Comparando 2 objetos boolean "+ (objBoolean==objBoolean2));
        System.out.println("Comparando 2 objetos boolean "+ (objBoolean2==objBoolean3));

    }
}
