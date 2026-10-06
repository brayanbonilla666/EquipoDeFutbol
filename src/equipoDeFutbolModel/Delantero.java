/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipoDeFutbolModel;

public class Delantero extends Jugador{
    
    private int golesAnotados;
    
    private boolean titular_O_no;
    private String nombre;
    private String apellido;
    private int edad;


    public Delantero(int golesAnotados, boolean titular_O_no, String nombre, String apellido, int edad) {
        super(titular_O_no, nombre, apellido, edad);
        this.golesAnotados = golesAnotados;
        this.titular_O_no = titular_O_no;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\n  - {" + "|Goles Anotados: " + golesAnotados + "|, |Titular o No: " + titular_O_no + "|, |Nombre: " + nombre + "|, |Apellido: " + apellido + "|, |Edad: " + edad + "|" + '}';
    }
    
    
    
    
}
