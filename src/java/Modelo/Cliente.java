
package Modelo;


public class Cliente {
    int IdC;
    String DniC;
    String NombresC;
    String DireccionC;
    String EstadoC;

    public Cliente() {
    }

    public Cliente(int IdC, String DniC, String NombresC, String DireccionC, String EstadoC) {
        this.IdC = IdC;
        this.DniC = DniC;
        this.NombresC = NombresC;
        this.DireccionC = DireccionC;
        this.EstadoC = EstadoC;
    }

    public int getIdC() {
        return IdC;
    }

    public void setIdC(int IdC) {
        this.IdC = IdC;
    }

    public String getDniC() {
        return DniC;
    }

    public void setDniC(String DniC) {
        this.DniC = DniC;
    }

    public String getNombresC() {
        return NombresC;
    }

    public void setNombresC(String NombresC) {
        this.NombresC = NombresC;
    }

    public String getDireccionC() {
        return DireccionC;
    }

    public void setDireccionC(String DireccionC) {
        this.DireccionC = DireccionC;
    }

    public String getEstadoC() {
        return EstadoC;
    }

    public void setEstadoC(String EstadoC) {
        this.EstadoC = EstadoC;
    }
    
    
    
    
}
