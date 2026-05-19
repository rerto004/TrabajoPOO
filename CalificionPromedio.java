package examenscj;

import java.util.Scanner;

public class califDeAlumnos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String numeroControlMayor = "";
        double promedioMayor = 0.0;
        
        System.out.println("Evaluacion de la materia");
        for (int i = 1; i <= 20; i++) {
            
            System.out.println("Registro del Alumno #" + i);
            System.out.print("Ingrese el numero de control: ");
            String numeroControlActual = leer.next();
            
            double sumaCalificaciones = 0.0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Calificacion de la unidad " + j + ": ");
                double calificacion = leer.nextDouble();
                sumaCalificaciones = sumaCalificaciones + calificacion;
            }
            
            double promedioActual = sumaCalificaciones / 5;
            System.out.println("Promedio del alumno es: " + promedioActual);
            
            if (promedioActual > promedioMayor) {
                promedioMayor = promedioActual;
                numeroControlMayor = numeroControlActual;
            }
            
        } 
        
        System.out.println("RESULTADO FINAL");
        System.out.println("El alumno con el MAYOR PROMEDIO fue el numero de control: " + numeroControlMayor);
        System.out.println("Obtuvo un promedio de: " + promedioMayor);
        
        leer.close();
    }
}
