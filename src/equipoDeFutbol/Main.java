
package equipoDeFutbol;

import equipoDeFutbolModel.Defensa;
import equipoDeFutbolModel.Delantero;
import equipoDeFutbolModel.Equipo;
import equipoDeFutbolModel.Mascota;
import equipoDeFutbolModel.Mediocampo;
import equipoDeFutbolModel.Portero;
import equipoDeFutbolModel.Tecnico;

public class Main {

    public static void main(String[] args) {
        
        Tecnico tecnico1 = new Tecnico(5, true, "Jose0", "Martinez0", 0);
        Portero portero1 = new Portero(1, true, "Jose1", "Martinez1", 21);
        
        Defensa defensa1 = new Defensa(true, "Jose2", "Martinez2", 22);
        Defensa defensa2 = new Defensa(false, "Jose2.1", "Martinez2.1", 22);
        Defensa defensa3 = new Defensa(true, "Jose2.2", "Martinez2.2", 23);
        Defensa defensa4 = new Defensa(false, "Jose2.3", "Martinez2.3", 23);
        
        Mediocampo mediocampo1 = new Mediocampo(2, true, "jose3", "martinez3", 23);
        Mediocampo mediocampo2 = new Mediocampo(3, true, "jose3.1", "martinez3", 23);
        Mediocampo mediocampo3 = new Mediocampo(2, true, "jose3.2", "martinez3", 24);
        Mediocampo mediocampo4 = new Mediocampo(3, true, "jose3.3", "martinez3", 24);
        
        Delantero delantero1 = new Delantero(3, true, "Jose4", "Martinez4", 24);
        Delantero delantero2 = new Delantero(4, false, "Jose4.1", "Martinez4.1", 24);
        
        
        Equipo mEquipo = new Equipo("BocaJunior", "Argentina");

        Equipo equipo1 = new Equipo("BocaJunior", "Argentina", null, null, null, null, null);
        
        equipo1.setPortero(portero1);
        equipo1.setTecnico(tecnico1);
        
        equipo1.inscribirDelantero(delantero1);
        equipo1.inscribirDelantero(delantero2);
        
        String mensaje1 = mEquipo.toString();
        System.out.println(mensaje1);
        
        String mensaje= equipo1.toString();
        System.out.println(mensaje);
    }
    
}
