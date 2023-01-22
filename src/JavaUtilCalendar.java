import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

//        calendario.set(1983,6,27, 8,00,00);

        calendario.set(Calendar.HOUR,7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.YEAR, 2027);
        calendario.set(Calendar.MONTH,Calendar.DECEMBER);
        calendario.set(Calendar.DAY_OF_MONTH,31);

        Date fecha = calendario.getTime();



        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        String dateFormat =   df.format(fecha);

        System.out.println("dateFormat = " + dateFormat);


    }
}
