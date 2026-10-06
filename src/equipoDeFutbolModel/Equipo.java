/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipoDeFutbolModel;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    
    private String nombre;
    private String pais;
    private Mascota mascota;
    private Tecnico tecnico;
    private Portero portero;
    private List<Defensa> defensas;
    private List<Mediocampo> mediocampos;
    private List<Delantero> delanteros;
    
    
    

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.mascota = new Mascota("Manuel", "NoBinario", "Horrible");
//        this.tecnico = null;
        this.portero = null;
//        this.defensas = new ArrayList<>();
//        this.mediocampos = new ArrayList<>();
        this.delanteros = new ArrayList<>();
    }

    public Equipo(String nombre, String pais, 
            String nombreM, String especieM, String aspectoM, 
             Portero portero, List<Delantero> delanteros) {
        
        this.nombre = nombre;
        this.pais = pais;
        this.mascota = new Mascota(nombreM, especieM, aspectoM);
//        this.tecnico = tecnico;
        this.portero = portero;
        
//        if (defensas.size() >= 4) {
//            this.defensas = defensas;
//        } else {
//            throw new IllegalArgumentException("Debe tener almenos 4 defensas");
//        }
//        
//        if (mediocampos.size() >= 4) {
//            this.mediocampos = mediocampos;
//        } else {
//            throw new IllegalArgumentException("Debe tener almenos 4 mediocampos");
//        }
//        
        if (delanteros.size() >= 2) {
            this.delanteros = delanteros;
        } else {
            throw new IllegalArgumentException("Debe tener almenos 2 delanteros");
        }
    }

    public void setPortero(Portero portero) {
        this.portero = portero;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    
    
    public void inscribirDefensa(Defensa defensa) {
        this.defensas.add(defensa);
    }
    
    public void inscribirMediocampo(Mediocampo mediocampo) {
        this.mediocampos.add(mediocampo);
    }
    
    public void inscribirDelantero(Delantero delantero) {
        this.delanteros.add(delantero);
    }
    
    public void Imprimir() {
        
        System.out.println("Imprimir informacion del equipo");
        System.out.println("Nombre del equipo: " + nombre);
        
        if (portero != null) {
            System.out.println("El portero tiene: " + portero.getGolesRecibidos());
        } else {
            System.out.println("No hay un portero asignado");
        }
        
        System.out.println("");
        
        
    }

    @Override
    public String toString() {
        return "Equipo{" 
                + "\n Nombre: " + nombre + ""
                + "\n Pais: " + pais + ""
                + "\n Mascota: " + mascota + ""
                + "\n Tecnico: " + tecnico + ""
                + "\n Portero: " + portero + ""
                + "\n Defensas: " + defensas + ""
                + "\n Mediocampos: " + mediocampos + ""
                + "\n Delanteros: " + delanteros + ""
                + "\n}";
    }
    
    
    
    
    
}
