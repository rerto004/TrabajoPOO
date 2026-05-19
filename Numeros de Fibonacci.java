package examenscj;

public class numerosFibonacci {
     public static void main(String[] args) {
        
        System.out.println("Los primeros 50 numeros de la sucesion de Fibonacci");
        long numeroAnterior = 0;
        long numeroActual = 1;
        long siguienteNumero;
        
        System.out.println("Los numeros son:");
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ". " + numeroAnterior);
            siguienteNumero = numeroAnterior + numeroActual;
            numeroAnterior = numeroActual;
            numeroActual = siguienteNumero;
            
        } 
        System.out.println("Fin del programa.");
    }
}
