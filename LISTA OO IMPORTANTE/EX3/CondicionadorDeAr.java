public class CondicionadorDeAr {
    private boolean ligado;
    private Termostato termostato;

    public CondicionadorDeAr() {
        this.ligado = false;
        this.termostato = new Termostato();
    }

    public boolean getLigado() {
        return ligado;
    }

    public Termostato getTermostato() {
        return termostato;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }


    public void aumentarTemperatura(int valorDesejado) {
        if (ligado) {
            while (termostato.getTemperatura() < valorDesejado && termostato.getTemperatura() < 28) {
                termostato.setTemperatura(termostato.getTemperatura() + 1);
                System.out.println("Temperatura: " + termostato.getTemperatura() + "°C.");
            }
            if (termostato.getTemperatura() >= 28) {
                System.out.println("t máx");
            } else if (termostato.getTemperatura() >= valorDesejado) {
                System.out.println("Temperatura ajustada para: " + termostato.getTemperatura() + "°C.");
            }
        } else {
            System.out.println("desligado.");
        }
    }

    public void reduzirTemperatura(int valorDesejado) {
        if (ligado) {
            while (termostato.getTemperatura() > valorDesejado && termostato.getTemperatura() > 15) {
                termostato.setTemperatura(termostato.getTemperatura() - 1);
                System.out.println("Temperatura: " + termostato.getTemperatura() + "°C.");
            }
            if (termostato.getTemperatura() <= 15) {
                System.out.println("T mín (15°C).");
            } else if (termostato.getTemperatura() <= valorDesejado) {
                System.out.println("Temperatura ajustada para: " + termostato.getTemperatura() + "°C.");
            }
        } else {
            System.out.println("desligado.");
        }
    }

    public void setTemperatura(int valor) {
        if (ligado) {
            termostato.setTemperatura(valor);
        } else {
            System.out.println("desligado.");
        }
    }

    public void imprimirTemperatura() {
        if (ligado) {
            termostato.imprimirTemperatura();
        } else {
            System.out.println("desligado.");
        }
    }
}