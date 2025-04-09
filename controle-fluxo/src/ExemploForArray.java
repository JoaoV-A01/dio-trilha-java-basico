public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"João", "Maria", "José", "Ana", "Pedro"};

        // for (int i = 0; i < alunos.length; i++) {
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
