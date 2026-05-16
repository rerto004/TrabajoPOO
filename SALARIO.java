package examenscj;

import java.util.Scanner;

public class calculoImpuesto {
  public static void main (String[] args){
      Scanner scanner = new Scanner (System.in);
      System.out.println("Introdusca el salario mensual");
      double salario = scanner.nextDouble();
      
      if (salario <= 0){
          System.out.println("El salario debe ser mayor a 0");
      } else  {
          double impuesto = 0; 
          if (salario<10000){
              impuesto=0;
          }else if (salario<=20000){
              impuesto = salario * 0.10;
          }else if (salario <=35000){
              impuesto = salario * 0.20;
          }else{
              impuesto = salario * 0.30;
          }
          System.out.println("Salario= $" + salario);
          System.out.println("El impuesto a pagar es: $" + impuesto);
      }
  } 
}
