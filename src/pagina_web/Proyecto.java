
package pagina_web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Proyecto {
    private String nombre;
    private String fecha;
    private String importancia;
    private List<String> tareas;
    private List<String> integrantes;
    private List<TareaItem> detalleTareas;

    public Proyecto(String nombre, String fecha, String importancia) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.importancia = importancia;
        this.tareas = new ArrayList<>();
        this.integrantes = new ArrayList<>();
        this.detalleTareas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }

    public List<String> getTareas() {
        return tareas;
    }

    public void agregarTarea(String tarea) {
        this.tareas.add(tarea);
    }
    
    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < this.tareas.size()) {
            this.tareas.remove(indice);
        }
    }
    public List<String> getIntegrantes() {
        return integrantes;
    }

    public void agregarIntegrante(String integrante) {
        if (integrante != null && !integrante.trim().isEmpty()) {
            this.integrantes.add(integrante.trim());
        }
    }

    public void eliminarIntegrante(int indice) {
        if (indice >= 0 && indice < this.integrantes.size()) {
            this.integrantes.remove(indice);
        }
    }
    
    public List<TareaItem> getDetalleTareas() {
        return detalleTareas;
    }

    public void agregarTareaConDetalle(String nombreTarea) {
        if (nombreTarea != null && !nombreTarea.trim().isEmpty()) {
            String limpio = nombreTarea.trim();
            this.tareas.add(limpio);
            this.detalleTareas.add(new TareaItem(limpio, "Sin asignar", "por iniciar"));
        }
    }

    public void eliminarTareaConDetalle(int indice) {
        if (indice >= 0 && indice < this.tareas.size()) {
            this.tareas.remove(indice);
        }
        if (indice >= 0 && indice < this.detalleTareas.size()) {
            this.detalleTareas.remove(indice);
        }
    }
}

class TareaItem {
    private String nombre;
    private String responsable;
    private String estado;

    public TareaItem(String nombre, String responsable, String estado) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.estado = estado;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getResponsable() { return responsable; }
    public void setResponsable(String responsable) { this.responsable = responsable; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
