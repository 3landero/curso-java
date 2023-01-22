import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilParseDate {
    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la fecha num 1 con formato dd-MM-yyyy");
        String fecha1 = scanner.next();
        System.out.println("Ahora ingresa la fecha num 2 con formato dd-MM-yyyy");
        String fecha2 = scanner.next();

        try {
            Date fechaFormat1 = format.parse(fecha1);
            Date fechaFormat2 = format.parse(fecha2);

            if (fechaFormat1.after(fechaFormat2)){
                System.out.println("fecha = " + format.format(fechaFormat1));
                System.out.println("la fecha1 es posterior a la fecha2");
            }else if(fechaFormat1.before(fechaFormat2)){
                System.out.println("fecha = " + format.format(fechaFormat2));
                System.out.println("la fecha2 es posterior a la fecha1");
            }else if(fechaFormat1.equals(fechaFormat2)){
                System.out.println("fechaFormat1 = " + fechaFormat1);
                System.out.println("fechaFormat2 = " + fechaFormat2);
                System.out.println("Ambas fechas son la misma");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
