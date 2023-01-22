import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String[] usernames = {"ramses", "admin", "pepe"};
        String[] passwords = {"12345","54321","78910"};

/*
        String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "ramses";
        passwords[0] = "12345";
        usernames[1] = "admin";
        passwords[1] = "54321";
        usernames[2] = "pepe";
        passwords[2] = "78910";
*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su username");
        String nickname = scanner.nextLine();

        System.out.println("Ingrese su password");
        String pass = scanner.next();

        boolean isAuthenticated = false;

        for (int i=0; i < usernames.length; i++) {
            isAuthenticated = usernames[i].equals(nickname) && passwords[i].equals(pass) ? true : isAuthenticated;
        }

        String mensaje =  isAuthenticated ?
                "Bienvenido usuario  ".concat(nickname).concat("!") :
                "Username o password incorrectos \n Lo sentimos, se requiere autenticacion";

        System.out.println(mensaje);

    }
}
