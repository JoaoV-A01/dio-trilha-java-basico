
import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            //imprimindo os dados
            System.out.println("Ola, me chamo: " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Minha idade é: " + idade + " anos.");
            System.out.println("Minha altura é: " + altura + " metros.");
            scanner.close();

        }
        catch (InputMismatchException e) {
            System.out.println("Os Campos de idade e altura devem ser numéricos.");
            System.out.println("Por favor, tente novamente.");
        }

    }
}
