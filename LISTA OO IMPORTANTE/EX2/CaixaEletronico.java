public class CaixaEletronico {
    public static void main(String[] args) {
        
        Agencia agencia = new Agencia("Agência Central", 7890);
        ContaCorrente conta = new ContaCorrente(1234, agencia, 150.00);
        Cliente cliente = new Cliente("Ademar Apior", "123231518-12", conta);

        conta.sacar(140.00);
        System.out.println("Saldo após saque: R$ " + conta.consultarSaldo());


        System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
        conta.sacar(200.00);


        System.out.println("Saldo após falha no saque: R$ " + conta.consultarSaldo());


        System.out.println("Saldo atual: R$ " + conta.consultarSaldo());


        conta.depositar(25.45);
        System.out.println("Saldo após depósito: R$ " + conta.consultarSaldo());
        conta.imprimirSaldo();
    }
}

