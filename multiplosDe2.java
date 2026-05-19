package examenscj;

public class MultiplosDe2 {
/*Imprimir en consola todos los números múltiplos de 2.
El ciclo finalizará cuando el último múltiplo sea menor 
a 4570
*/
    public static void main(String[] args) {
        int numero = 2;
        while (numero < 4570) {
            System.out.println (numero);
            numero += 2; 
        }
    }
}
