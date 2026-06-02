//*Clase principal 
package figurasgeometricaspoo1;

import javax.swing.JOptionPane;

public class FigurasGeometricasPOO1 {

    /**
     * @param args the command line arguments
     */
    private int menu() {
        String opciones = "Figuras Geometricas:\n"
                + "1. Circulo\n"
                + "2. Triangulo\n"
                + "3. Rectangulo\n"
                + "4. Cuadrado\n"
                + "Elige una figura:";
        String input = JOptionPane.showInputDialog(opciones);
        if (input == null) {
                        JOptionPane.showMessageDialog(null, "Operacion cancelada");
                        System.exit(0);
                    }
        int opc = Integer.parseInt(input);
        return opc;

    }

    public void main(String[] args) {
        float radio, base, altura, lado;
        String input;
        do {
        int opc = menu();
            switch (opc) {
                case 1:
                    input = JOptionPane.showInputDialog("Introduce el valor del radio");
                    if (input == null) {
                        JOptionPane.showMessageDialog(null, "Operacion cancelada");
                        System.exit(0);
                    }
                    radio = Float.parseFloat(input);
                    Circulo objCirc = new Circulo(radio);
                    objCirc.calcularArea();
                    JOptionPane.showInternalMessageDialog(null, "El area es:" + objCirc.getArea());
                    break;
                case 2:
                    input = JOptionPane.showInputDialog("Introduce la base del triangulo");
                    if (input == null) {
                        JOptionPane.showMessageDialog(null, "Operacion cancelada");
                        System.exit(0);
                    }
                    base = Float.parseFloat(input);
                    input = JOptionPane.showInputDialog("introduce la altura del triangulo");
                    altura = Float.parseFloat(input);
                    Triangulo objTri = new Triangulo( altura, base);
                    objTri.calculadoraArea();
                    JOptionPane.showMessageDialog(null, "El area es:" + objTri.getArea());
                    break;
                case 3:
                    input = JOptionPane.showInputDialog("Introduce la base del Rectangulo");
                    if (input == null) {
                        JOptionPane.showMessageDialog(null, "Operacion cancelada");
                        System.exit(0);
                    }
                    base = Float.parseFloat(input);
                    input = JOptionPane.showInputDialog("introduce la altura del Rectangulo");
                    altura = Float.parseFloat(input);
                    Rectangulo objRec = new Rectangulo(base, altura);
                    objRec.calcularArea();
                    JOptionPane.showMessageDialog(null, "El area es:" + objRec.getArea());
                    break;
                case 4:
                    input = JOptionPane.showInputDialog("Introduce la base del Rectangulo");
                    if (input == null) {
                        JOptionPane.showMessageDialog(null, "Operacion cancelada");
                        System.exit(0);
                    }
                    lado = Float.parseFloat(input);
                    Cuadrado objCuad = new Cuadrado(lado);
                    objCuad.calcularArea();
                    JOptionPane.showMessageDialog(null, "El area es:" + objCuad.getArea());
                    break;
                case 5:
                    System.exit(0);
                default: JOptionPane.showMessageDialog(null,"Opcion no valida");
                }
        } while (true);
        
    }

}
//* circulo
package figurasgeometricaspoo1;
public class Circulo {
    float radio, area;
    public Circulo(float radio) {
        this.radio = radio;
        this.area = area;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getArea() {
        return area;
    }
    
    public void calcularArea(){
        this.area= (float) (Math.PI * Math.pow(this.radio,2));
    }
    
}
//*Cuadrado 
package figurasgeometricaspoo1;
public class Cuadrado {
    float lado, area;

    public Cuadrado(float lado) {
        this.lado = lado;
    }
 public void calcularArea(){
     this.area = this.lado * this.lado;
     
    } 

    public float getArea() {
        return area;
    }
 
}
//*Rectangulo 
package figurasgeometricaspoo1;

public class Rectangulo {
    float base, altura, area;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public void calcularArea(){
        this.area = this.base * this.altura;
    }

    public float getArea() {
        return area;
    }
    
}

//*Triangulo 
package figurasgeometricaspoo1;
public class Triangulo {
    float base, altura, area;
    public Triangulo(float altura, float base) {
        this.altura = altura;
        this.base = base;      
    } 
    public void calculadoraArea(){
          this.area = this.base * this.altura / 2;
    }
    public float getArea() {
        return area;
    }  
}
