package examenscj;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class menuoperaciones {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0, num2 = 0, opcion = 1;
        String input;
         
        JOptionPane.showMessageDialog(null, "Sumar, Resta, Multiplicacion, Division\nde 2 numeros enteros");

        
        do {
            input = JOptionPane.showInputDialog("Introduce el primer Número");
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Operacion cancelada");
                System.exit(0);
            } else if (input.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No ingresaste ningun valor");
            } else {
                try {
                    num1 = Integer.parseInt(input);
                    if (num1 <= 0) {
                        JOptionPane.showMessageDialog(null, "Debe ser un numero positivo");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Debes de ingresar un numero entero");
                }
            }
        } while (true);
        System.out.println("Numero 1: " + num1 + " capturado correctamente");
        do {
            input = JOptionPane.showInputDialog("Introduce el segundo Número");
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Operacion cancelada");
                System.exit(0);
            } else if (input.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No ingresaste ningun valor");
            } else {
                try {
                    num2 = Integer.parseInt(input);
                    if (num2 <= 0) {
                        JOptionPane.showMessageDialog(null, "Debe ser un numero positivo");
                    } else {
                        break; 
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Debes de ingresar un numero entero");
                }
            }
        } while (true);
        System.out.println("Numero 2: " + num2 + " capturado correctamente");

        String menu = "Menu de operaciones\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n"
                + "5. Salir";
        do {
            String resultado = "Resultado: "; 
            do {
                input = JOptionPane.showInputDialog(menu);
                if (input == null) {
                    JOptionPane.showMessageDialog(null, "Operacion cancelada");
                    System.exit(0);
                } else if (input.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No ingresaste ningun valor");
                } else {
                    try {
                        opcion = Integer.parseInt(input);
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Debes de ingresar una opcion valida (numero entero)");
                    }
                }
            } while (true);

            switch (opcion) {
                case 1 -> {
                    int suma = num1 + num2;
                    resultado = resultado + suma; 
                    JOptionPane.showMessageDialog(null, resultado);
                }
                case 2 -> {
                    int resta = num1 - num2;
                    resultado = resultado + resta;
                    JOptionPane.showMessageDialog(null, resultado);
                }
                case 3 -> {
                    int multiplicacion = num1 * num2;
                    resultado = resultado + multiplicacion;
                    JOptionPane.showMessageDialog(null, resultado);
                }
                case 4 -> {
                    if (num2 != 0) {
                        double division = (double) num1 / num2; 
                        resultado = resultado + division;
                    } else {
                        resultado = resultado + "No se puede dividir entre 0";
                    }
                    JOptionPane.showMessageDialog(null, resultado);
                }
                case 5 -> {
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    System.exit(0);
                }
                default -> JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
            
        } while (opcion != 5);
        
        teclado.close();
    }
}
