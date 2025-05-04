public class Agencia {
    private String nome;
    private int numero;
    private int digito;

    public Agencia(String nome, int numero) {
        this.nome = nome;

        if (numero > 0 && numero <= 9999) {
            this.numero = numero;
            this.digito = calcularDigito(numero);
        } else {
            System.out.println("Número inválido");
            this.numero = 1;
            this.digito = calcularDigito(this.numero);
        }
    }

    private int calcularDigito(int numero) {
        int m = (numero / 1000) % 10;
        int c = (numero / 100) % 10;
        int d = (numero / 10) % 10;
        int u = numero % 10;

        int soma = m * 4 + c * 6 + d * 8 + u * 2;
        int resto = soma % 11;

        return (resto == 10) ? 0 : resto;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public int getDigito() {
        return digito;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        if (numero > 0 && numero <= 9999) {
            this.numero = numero;
            this.digito = calcularDigito(numero);
        } else {
            System.out.println("Número inválido.");
        }
    }

    public String getDados() {
        return "Agência: " + numero + "-" + digito + "\nNome: " + nome;
    }
}
