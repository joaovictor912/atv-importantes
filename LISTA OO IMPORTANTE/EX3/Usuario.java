public class Usuario {
    public static void main(String[] args) {
        
        CondicionadorDeAr ar = new CondicionadorDeAr();
        
        ar.ligar();

      
        System.out.println("Tentando aumentar temperatura para 30°C:");
        ar.aumentarTemperatura(30);
        System.out.println("\nTentando reduzir temperatura para 10°C:");
        ar.reduzirTemperatura(10);
        System.out.println("\nAumentando temperatura para 25°C:");
        ar.aumentarTemperatura(25);
        System.out.println("\nImprimindo temperatura atual:");
        ar.imprimirTemperatura();
    }
}