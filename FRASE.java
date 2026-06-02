//*Este la clase principal 
package caracteresfrasepoo;

import javax.swing.JOptionPane;

public class CaracteresFrasePOO {

    public static void main(String[] args) {
        String frase;
        frase = JOptionPane.showInputDialog("Introduce una frase");
        Caracter objCar1 = new Caracter();
        objCar1.setFrase(frase);
        objCar1.contarVocalesConsonantes();
        System.out.println("Total vocales:" + objCar1.getTotVocales());
        System.out.println("Total consonantes:" + objCar1.getTotConsonantes());
        System.out.println("Total Digitos:" + objCar1.getTotDigitos());
        System.out.println("Total Caracteres Especiales:" + objCar1.getTotCaracteresEspeciales());
        
    }
    
}

//*Esta es la otra parte caracter
package caracteresfrasepoo;

public class Caracter {
    private String frase;

    public int getTotVocales() {
        return totVocales;
    }

    public int getTotConsonantes() {
        return totConsonantes;
    }

    public int getTotDigitos() {
        return totDigitos;
    }

    public int getTotCaracteresEspeciales() {
        return totCaracteresEspeciales;
    }
    int totVocales;
    int totConsonantes;
    int totDigitos;
    int totCaracteresEspeciales;     
    
    public Caracter(){
        this.frase="";
        this.totCaracteresEspeciales=0;
        this.totConsonantes=0;
        this.totDigitos=0;
        this.totVocales=0;
       
    }

    public String getFrase() {
        return frase;
    }
    public void setFrase(String frase) {
        this.frase = frase;
    }
    public void contarVocalesConsonantes(){
    int i;
    char caracter;
    String vocales = "aeiouAEIOU";
    for(i = 0; i < this.frase.length(); i++){
        caracter = this.frase.charAt(i);
        if (vocales.indexOf(caracter) != -1) {
            this.totVocales++;
        } 
        else if (Character.isDigit(caracter)) {
            this.totDigitos++;
        } 
        else if (Character.isLetter(caracter)) {
            this.totConsonantes++;
        } 
        else {
            this.totCaracteresEspeciales++;
        }
    } 
    }
}
