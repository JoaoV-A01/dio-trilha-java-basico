public class Operadores {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        // Operadores lógicos
        
        // && (E lógico) - retorna verdadeiro se ambas as condições forem verdadeiras
        if (condicao1 && condicao2) {
            System.out.println("Ambas as condições são verdadeiras.");
        }

        // || (OU lógico) - retorna verdadeiro se pelo menos uma das condições for verdadeiras
        if (condicao1 || condicao2) {
            System.out.println("Pelo menos uma das condições é verdadeira.");
        }

        System.out.println("fim");
    }
}
