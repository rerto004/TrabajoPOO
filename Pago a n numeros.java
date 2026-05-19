package examenscj;

import java.util.Scanner;

public class pagarEnNMeses {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int meses;
        double pagoMensual;
        double totalPagado;
        int opcion;
        System.out.println("Calcular el plazo de pagos");
        do {
            pagoMensual = 100.0;
            totalPagado = 0.0;
            System.out.println("\nNuevo Calculo");
            System.out.print("¿En cuantos meses va a pagar el producto?: ");
            meses = leer.nextInt();
            System.out.println("\nLos pagos son:");
            for (int i = 1; i <= meses; i++) {
                System.out.println("Mes " + i + ": $" + pagoMensual);
                totalPagado = totalPagado + pagoMensual;
                pagoMensual = pagoMensual * 2; 
            }
         
            System.out.println("Total a pagar despues de " + meses + " meses: $" + totalPagado);
            
            System.out.println("\n¿Desea calcular los pagos para otro producto?");
            System.out.println("1. Si");
            System.out.println("2. No (Salir)");
            System.out.print("Elija una opcion (1 o 2): ");
            opcion = leer.nextInt();
            
        } while (opcion == 1);
        leer.close();
    }
}
