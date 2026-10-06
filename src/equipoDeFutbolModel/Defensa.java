/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipoDeFutbolModel;

public class Defensa extends Jugador{
    
    public Defensa(boolean titular_O_no, String nombre, String apellido, int edad) {
        super(titular_O_no, nombre, apellido, edad);
    }

    @Override
    public String toString() {
        return "Defensa{" + '}';
    }
    
    
}
