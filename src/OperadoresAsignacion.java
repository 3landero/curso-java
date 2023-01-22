public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 2;
        int j = i + 4;


        //--Operador Incremental
        i += 2; //  i = i + 2;
        System.out.println("i = " + i);

        i += 5; //  i = i + 5;
        System.out.println("i = " + i);

        j -= 4; // j = j - 4;
        System.out.println("i = " + i);

        j *= 3; // j = j * 3;
        System.out.println("j = " + j);

        String sqlString = "SELECT * FROM clientes AS c ";

        sqlString += "WHERE  c.nombre = 'Andres' ";
        sqlString += "AND c.activo =1";

        System.out.println("sqlString = " + sqlString);

    }

}
