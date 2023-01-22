import javax.swing.*;
public class OperadorAritmetico {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;

        System.out.println("suma = " + suma);

        double division = (float)j/i;

        System.out.println("division = " + division);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));

        if (numero%2==0){
            System.out.println("numero par = " + numero);
        }else{
            System.out.println("numero es impar = " + numero);
        }

    }
}
