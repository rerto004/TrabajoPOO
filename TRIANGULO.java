package examenscj;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ExamenSCJ {
    public static void main(String[] args) {
    int lado1 = 0,lado2,lado3;
    Scanner entrada = new Scanner(System.in);
    String input ="";
    
    do {
            input = JOptionPane.showInputDialog("Introduce el primer lado del triangulo");
        if (input==null)
        {
            JOptionPane.showMessageDialog(null, "Operacion cancelada");
            System.exit(0);
        }else if (input.trim().isEmpty())
        {
              JOptionPane.showMessageDialog(null, "No ingresaste ningun valor");
        }else{
            try{
                 lado1 = Integer.parseInt(input);
                 if(lado1<=0)
                     JOptionPane.showMessageDialog(null,"Debe ser un numero positivo");
                 else 
                 break;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Debes de ingresar un numero entero");
            }
        } 
        }while (true);
    
    do {
            input = JOptionPane.showInputDialog("Introduce el segundo lado del triangulo");
        if (input==null)
        {
            JOptionPane.showMessageDialog(null, "Operacion cancelada");
            System.exit(0);
        }else if (input.trim().isEmpty())
        {
              JOptionPane.showMessageDialog(null, "No ingresaste ningun valor");
        }else{
            try{
                 lado2 = Integer.parseInt(input);
                 if(lado2<=0)
                     JOptionPane.showMessageDialog(null,"Debe ser un numero positivo");
                 else 
                 break;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Debes de ingresar un numero entero");
            }
        } 
        }while (true);
    
    do {
            input = JOptionPane.showInputDialog("Introduce el tercer lado del triangulo");
        if (input==null)
        {
            JOptionPane.showMessageDialog(null, "Operacion cancelada");
            System.exit(0);
        }else if (input.trim().isEmpty())
        {
              JOptionPane.showMessageDialog(null, "No ingresaste ningun valor");
        }else{
            try{
                 lado3 = Integer.parseInt(input);
                 if(lado3<=0)
                     JOptionPane.showMessageDialog(null,"Debe ser un numero positivo");
                 else 
                 break;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Debes de ingresar un numero entero");
            }
        } 
        }while (true);
    
    
    if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
        if (lado1 == lado2 && lado2==lado3){
        JOptionPane.showMessageDialog(null,"Es un tringulo Equilatero");
    }
    
    else if(lado1 == lado2 || lado1==lado3 || lado2==lado3){
        JOptionPane.showMessageDialog(null,"Es un triangulo Isosceles");
    }
    
    else{
        JOptionPane.showMessageDialog(null,"Es un tringulo Escaleno");
    } 
    } else{
        JOptionPane.showMessageDialog(null, "Error: Los valores ingresados no pueden formar un triángulo válido.");
    }
    }
    
}
