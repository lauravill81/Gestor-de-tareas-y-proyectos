package pagina_web;

public class Nodo {
    Tarea tarea;
    Nodo izquierdo, derecho;

    public Nodo(Tarea tarea) {
        this.tarea = tarea;
        this.izquierdo = null;
        this.derecho = null;
    }
}