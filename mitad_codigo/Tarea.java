package pagina_web;
import java.util.Date;
public class Tarea {
    private String nombre;
    private Date fechaEntrega;
    private String importancia; 

    public Tarea(String nombre, Date fechaEntrega) {
        this.nombre = nombre;
        this.fechaEntrega = fechaEntrega;
        this.importancia = "Pendiente"; 
    }

    public String getNombre() { return nombre; }
    public Date getFechaEntrega() { return fechaEntrega; }
    public String getImportancia() { return importancia; }
    
    public void setImportancia(String importancia) { 
        this.importancia = importancia; 
    } 
}
