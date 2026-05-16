package examenscj;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class calificacion {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int calif;
        String input ="";
    
    do {
            input = JOptionPane.showInputDialog("Introdusca la calificacion del estudainte:");
        if (input==null)
        {
            JOptionPane.showMessageDialog(null, "Operacion cancelada");
            System.exit(0);
        }else if (input.trim().isEmpty())
        {
              JOptionPane.showMessageDialog(null, "No ingresaste ningun valor");
        }else{
            try{
                 calif = Integer.parseInt(input);
                 if(calif<=0)
                     JOptionPane.showMessageDialog(null,"Debe ser un numero positivo");
                 else 
                 break;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Debes de ingresar un numero entero");
            }
        } 
        }while (true);
    
        if (calif < 0  || calif > 100){
            JOptionPane.showMessageDialog(null,"Error, la calificacion debe ser entre 0 y 100");
        }else {
            String mencion = "";
            String estado ="Aprobado";
            
            if (calif >=90){
                mencion = "Excelente";
            }else if (calif >=80){
                mencion = "Muy bien";
            }else if (calif >=70) {
                mencion ="Bien";
            }else if (calif >=60){
                mencion = "Suficiente"; 
            }else {
                mencion = "Sin mencion";
                estado = "Reprobado";
            }
            JOptionPane.showMessageDialog(null,"Calificaion: " +  calif 
                    + "\n Mencion: " +  mencion 
                    + "\n Estado: " + estado );
        }
    }
}
