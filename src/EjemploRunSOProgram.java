import java.io.IOException;

public class EjemploRunSOProgram {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process process;

        try{
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                process = rt.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                process = rt.exec("textedit");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("linux")) {
                process = rt.exec("gedit");
            } else {
                process = rt.exec("gedit");
            }
            process.waitFor();
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.err.println("Se ha cerrado el editor" + e.getMessage() );
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor" );
        System.exit(1);
    }
}
