package examenscj;

import java.util.Random;
import java.util.Scanner;


public class adivinarElNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        
        int numeroSecreto = aleatorio.nextInt(100) + 1; // GENERA EL NUMERO RAMDON
        int intentosRestantes = 10;
        int intentosRealizados = 0;
        boolean haAcertado = false;
        
        System.out.println("Intenta adivinar el número entre 1 y 100.");
        
        while (intentosRestantes > 0 && !haAcertado) {
            System.out.println("\nTienes " + intentosRestantes + " intentos restantes.");
            System.out.print("Introduce tu número: ");
            int numeroUsuario = teclado.nextInt();
            
            intentosRealizados++;
            intentosRestantes--;
            
            if (numeroUsuario == numeroSecreto) {
                haAcertado = true;
                System.out.println("Felicidades as acertado el número en " + intentosRealizados + " intentos.");
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El número secreto es MAYOR que " + numeroUsuario);
            } else {
                System.out.println("El número secreto es MENOR que " + numeroUsuario);
            }
        }
        
        if (!haAcertado) {
            System.out.println("\nLo siento te has quedado sin intentos. El número era: " + numeroSecreto);
        }
        
        teclado.close();
    }
   
}
