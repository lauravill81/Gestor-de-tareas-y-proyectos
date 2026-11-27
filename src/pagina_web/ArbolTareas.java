package pagina_web;

import patrones.EstrategiaImportancia;
import patrones.ImportanciaPorFechaProxima;

public class ArbolTareas {
    Nodo raiz;
    private EstrategiaImportancia estrategiaImportancia = new ImportanciaPorFechaProxima();

    public void setEstrategiaImportancia(EstrategiaImportancia estrategiaImportancia) {
        if (estrategiaImportancia != null) {
            this.estrategiaImportancia = estrategiaImportancia;
        }
    }

    public void insertar(Tarea nuevaTarea) {
        raiz = insertarRecursivo(raiz, nuevaTarea);
    }

    private Nodo insertarRecursivo(Nodo actual, Tarea nuevaTarea) {
        if (actual == null) {
            calcularYSetearImportancia(nuevaTarea);
            return new Nodo(nuevaTarea);
        }

        if (nuevaTarea.getFechaEntrega().before(actual.tarea.getFechaEntrega())) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, nuevaTarea);
        } else {
            actual.derecho = insertarRecursivo(actual.derecho, nuevaTarea);
        }

        calcularYSetearImportancia(nuevaTarea);
        return actual;
    }

    private void calcularYSetearImportancia(Tarea tarea) {
        String importancia = estrategiaImportancia.calcularImportancia(tarea.getFechaEntrega());
        tarea.setImportancia(importancia);
    }

    public Tarea obtenerMasProxima() {
        if (raiz == null) return null;
        Nodo temporal = raiz;
        while (temporal.izquierdo != null) {
            temporal = temporal.izquierdo;
        }
        return temporal.tarea;
    }
}