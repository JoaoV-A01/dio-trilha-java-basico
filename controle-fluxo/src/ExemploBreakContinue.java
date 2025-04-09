public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++) {
            if(numero == 3)
                //break; // Interrompe o loop quando numero é igual a 3 
                continue; // Pula para a próxima iteração do loop

            System.out.println(numero);
        }
    }
}
