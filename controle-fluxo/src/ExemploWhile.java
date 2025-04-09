
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada; // Se o valor do doce for maior que a mesada, ajusta o valor
            
            System.out.println("Doce do valor: " + valorDoce + " reais. Adicionando no carrinho");
            mesada -= valorDoce; // Subtrai o valor do doce da mesada
        }
        System.out.println("Mesada: " + mesada + " reais.");
        System.out.println("John gastou toda a mesada em doces.");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2.0, 8.0); // Gera um valor aleatório entre 1.0 e 10.0
    }
}
