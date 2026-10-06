/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipoDeFutbolModel;

public class Mascota {
    
    private String nombre;
    private String especie;
    private String aspecto;

    public Mascota(String nombre, String especie, String aspecto) {
        this.nombre = nombre;
        this.especie = especie;
        this.aspecto = aspecto;
    }

    @Override
    public String toString() {
        return "{" + "Nombre: " + nombre + ", Especie: " + especie + ", Aspecto: " + aspecto + '}';
    }
    
    
    
}
