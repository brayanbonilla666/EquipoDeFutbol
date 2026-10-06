/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipoDeFutbolModel;

public class Portero extends Jugador{
    
    private int golesRecibidos;
    
    private boolean titular_O_no;
    private String nombre;
    private String apellido;
    private int edad;

    public Portero(int golesRecibidos, boolean titular_O_no, String nombre, String apellido, int edad) {
        super(titular_O_no, nombre, apellido, edad);
        this.golesRecibidos = golesRecibidos;
        this.titular_O_no = titular_O_no;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }
    
    
    @Override
    public String toString() {
        return "{" + "Goles Recibidos: " + golesRecibidos + ", Titular o No: " + titular_O_no + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + '}';
    }
    
    
    
    
}
