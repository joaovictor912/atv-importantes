public class ContaCorrente {
    private int numero;
    private int digito;
    private Agencia agencia;
    private double saldo;

    public ContaCorrente(int numero, Agencia agencia, double saldo) {
        if (numero > 0 && numero <= 9999) {
            this.numero = numero;
            this.digito = calcularDigito(numero);
        } else {
            System.out.println("Número da conta inválido.");
            this.numero = 1;
            this.digito = calcularDigito(this.numero);
        }

        this.agencia = agencia;
        this.saldo = (saldo >= 0) ? saldo : 0;
    }

    private int calcularDigito(int numero) {
        int m = (numero / 1000) % 10;
        int c = (numero / 100) % 10;
        int d = (numero / 10) % 10;
        int u = numero % 10;

        int soma = m * 4 + c * 6 + d * 8 +  u* 2;
        int resto = soma % 11;

        return (resto == 10) ? 0 : resto;
    }

    public int getNumero() {
        return numero;
    }

    public int getDigito() {
        return digito;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("valor invalido.");
        }
    }

    public double sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return valor;
        } else {
            System.out.println("Saldo insuficiente.");
            return 0;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void imprimirSaldo() {
        System.out.println("Conta: " + numero + "-" + digito +   ", Agência: " + agencia.getNumero() + "-" + agencia.getDigito() + ", Saldo: R$ " + String.format("%.2f", saldo));
    }

    public String getDados() {
        return "Conta: " + numero + "-" + digito +  "\n" + agencia.getDados() + "\nSaldo: R$ " + String.format("%.2f", saldo);
    }
}
