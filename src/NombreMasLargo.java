import javax.swing.*;


public class NombreMasLargo {
    public static void main(String[] args) {
        String[] nombresCompletos = new String[3];
        String[] nombres= new String[3];

        String resultado = "";
        String resultado2 = "";

        String fullName1 = JOptionPane.showInputDialog("Ingrese el numbre de la persona 1");
        String nombreCompletoMasLargo = fullName1;
        String nombreMaslargo = fullName1.split(" ")[0];
        System.out.println("nombreMaslargo = " + nombreMaslargo);

        String fullName2 = JOptionPane.showInputDialog("Ingrese el numbre de la persona 2");
        String nombre1 =fullName2.split(" ")[0];

        if (nombreMaslargo.length() > nombre1.length()){
            resultado = nombreMaslargo;
            resultado2 = nombreCompletoMasLargo;
        }else {
            resultado = nombre1;
            resultado2 = fullName2;
        }

        String fullName3 = JOptionPane.showInputDialog("Ingrese el numbre de la persona 3");
        String nombre2 =fullName3.split(" ")[0];

        if (resultado.length() < nombre2.length()) {
            resultado = nombre2;
            resultado2 = fullName3;
        }

        String nombreMasLargo=resultado2
                ;
        System.out.println(nombreMasLargo + " tiene el nombre más largo.");

    }
}
