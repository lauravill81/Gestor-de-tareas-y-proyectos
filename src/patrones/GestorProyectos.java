/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones;

import java.util.ArrayList;
import java.util.List;
import pagina_web.Proyecto;

public class GestorProyectos {
    private final List<Proyecto> proyectos = new ArrayList<>();
    private final List<ObservadorProyecto> observadores = new ArrayList<>();

    public void suscribir(ObservadorProyecto observador) {
        if (observador != null && !observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    public void desuscribir(ObservadorProyecto observador) {
        observadores.remove(observador);
    }

    private void notificarObservadores() {
        for (ObservadorProyecto obs : observadores) {
            obs.onProyectosActualizados();
        }
    }

    public void agregarProyecto(Proyecto proyecto) {
        if (proyecto != null) {
            proyectos.add(proyecto);
            notificarObservadores();
        }
    }

    public void eliminarProyecto(int indice) {
        if (indice >= 0 && indice < proyectos.size()) {
            proyectos.remove(indice);
            notificarObservadores();
        }
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }
}
