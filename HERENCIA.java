//*codigo principal 
package herencia1;

import javax.swing.JOptionPane;

public class Herencia1 {

       public static void main(String[] args) {
        String numControl, nombre, apellidos, domicilio, telefono, carrera;
        int semestre;
        char grupo;
        
        numControl = JOptionPane.showInputDialog("Numero de control");
        nombre = JOptionPane.showInputDialog("Nombre del estudiante");
        apellidos = JOptionPane.showInputDialog("Apellidos");
        domicilio = JOptionPane.showInputDialog("Domicilio");
        telefono = JOptionPane.showInputDialog("Telefono");
        semestre = Integer.parseInt(JOptionPane.showInputDialog("Semestre (1-10)"));
        grupo = JOptionPane.showInputDialog("Grupo (A,B,C)").charAt(0);
        carrera = JOptionPane.showInputDialog("Carrera");
        Estudiante objEst = new Estudiante(numControl,nombre,apellidos,
                                          domicilio, telefono,semestre,
                                          grupo,carrera);
        String registro ="Num Control:" + objEst.getNumControl() +"\n" +
                         "Nombre:" + objEst.getNombre() + "\n" +
                         "Apellidos:" + objEst.getApellidos()+ "\n"+
                         "Domicilio:" + objEst.getDomicilio()+ "\n"+
                         "Telefono:" + objEst.getTelefono()+ "\n"+
                         "Semestre:" + objEst.getSemestre()+"\n"+
                         "Grupo:" + objEst.getGrupo()+"\n"+
                         "Carrera" + objEst.getCarrera();
        
        JOptionPane.showMessageDialog(null,registro);
        
        
        String rfc;
        int clave;
        rfc = JOptionPane.showInputDialog("RFC del docente");
        nombre = JOptionPane.showInputDialog("Nombre del docente");
        apellidos = JOptionPane.showInputDialog("Apellidos del docente");
        domicilio = JOptionPane.showInputDialog("Domicilio del docente");
        telefono = JOptionPane.showInputDialog("Telefono del docente");
        clave = Integer.parseInt(JOptionPane.showInputDialog("Clave (10, 20, 30, 40)"));
        Profesores objProf = new Profesores(rfc, nombre, apellidos, domicilio, telefono, clave);
        
        String registroProfesores = "RFC: " + objProf.getRfc() + "\n" +
                                 "Nombre: " + objProf.getNombre() + "\n" +
                                 "Apellidos: " + objProf.getApellidos() + "\n" +
                                 "Domicilio: " + objProf.getDomicilio() + "\n" +
                                 "Telefono: " + objProf.getTelefono() + "\n" +
                                 "Clave: " + objProf.getClave();

        JOptionPane.showMessageDialog(null, registroProfesores);
    }
       
    
}
//*codigo de persona
package herencia1;

public class Persona {
    String nombre;
    String apellidos;
    String domicilio;
    String telefono;

    public Persona(String nombre, String apellidos, String domicilio, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
//*Estudiante 
package herencia1;

public class Estudiante extends Persona{
    String numControl;
    int semestre;
    char grupo;
    String carrera;

    public Estudiante(String numControl,String nombre, String apellidos, String domicilio, 
            String telefono, int semestre, 
            char grupo, String carrera) {
        super(nombre, apellidos, domicilio, telefono);
        this.numControl = numControl;
        this.semestre = semestre;
        this.grupo = grupo;
        this.carrera = carrera;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumControl() {
        return numControl;
    }

    public int getSemestre() {
        return semestre;
    }

    public char getGrupo() {
        return grupo;
    }

    public String getCarrera() {
        return carrera;
    }        
    
}
//*Profesores
package herencia1;

public class Profesores extends Persona{

    String rfc;
    int clave;

    public Profesores(String rfc, String nombre, String apellidos, String domicilio, String telefono, int clave) {
        super(nombre, apellidos, domicilio, telefono);
        this.rfc = rfc;
        this.clave = clave;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    // Getters
    public String getRfc() {
        return rfc;
    }

    public int getClave() {
        return clave;
    }

}
