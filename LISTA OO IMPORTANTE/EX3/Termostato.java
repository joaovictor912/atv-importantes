public class Termostato {
    private int temperatura;

    public Termostato() {
        this.temperatura = 20;
    }

    public void imprimirTemperatura() {
        System.out.println("Temperatura atual: " + temperatura + "°C.");
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int valor) {
        if (valor >= 15 && valor <= 28) {
            temperatura = valor;
        } else {
            System.out.println("Erro.");
        }
    }
}