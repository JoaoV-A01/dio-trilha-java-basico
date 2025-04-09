public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 100.00; // saldo inicial
        double valorSolicitado = 17.0; // valor solicitado pelo usuário

        if(valorSolicitado < saldo) {
            
            saldo = saldo - valorSolicitado; // subtrai o valor solicitado do saldo
            System.out.println("Novo saldo: " + saldo); // imprime o saldo atual

        } else
            System.out.println("Saldo insuficiente!"); // imprime mensagem de saldo insuficiente
        
        
    }
}
