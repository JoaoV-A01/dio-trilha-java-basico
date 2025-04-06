public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos
        double salario = 1250.70;

        short numeroCurto = 2131;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Casting, conversão de int para short
    
        int numero = 3;

        numero = 2;

        final double VALOR_DE_PI = 3.14; // Constante, não pode ser alterada

        System.out.println(VALOR_DE_PI);

        //tipos referencia
        String nome = "Lucas";
    }
}
