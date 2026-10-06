/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipoDeFutbolModel;

public class Tecnico extends Persona{
    
    private int añosExp;
    private boolean nac_O_ext;

    public Tecnico(int añosExp, boolean nac_O_ext, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.añosExp = añosExp;
        this.nac_O_ext = nac_O_ext;
    }
    
    

    @Override
    public String toString() {
        return "{" + "Años De Experiencia: " + añosExp + ", Nacional o Extranjero: " + nac_O_ext + '}';
    }
}
