/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipoDeFutbolModel;

public class Jugador extends Persona{
    
    private boolean titular_O_no;

    public Jugador(boolean titular_O_no, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titular_O_no = titular_O_no;
    }
    

    
    
}
