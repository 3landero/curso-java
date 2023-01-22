import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola que tal";

        Class strClass =  texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());

        for (Method method : strClass.getMethods()) {
            System.out.println("method = " + method.getName());
        }

        }

    }
