package pagina_web;

public class Recorda {
    private String nombre;
    private String lista;
    private String fecha;
    private String nota;

    public Recorda(String nombre, String lista, String fecha, String nota) {
        this.nombre = nombre;
        this.lista = lista;
        this.fecha = fecha;
        this.nota = nota;
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return lista + " - " + nota; }
    public String getFecha() { return fecha; }
}
