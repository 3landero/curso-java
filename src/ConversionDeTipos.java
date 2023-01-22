public class ConversionDeTipos {
    public static void main(String[] args) {
        String NumeroString = "50";
        int numeroInt = Integer.parseInt(NumeroString);
        System.out.println(numeroInt);

        String realString = "98765.43";
        double realDouble = Double.parseDouble(realString);

        String logicoStr = "FalSe";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
    }
}
