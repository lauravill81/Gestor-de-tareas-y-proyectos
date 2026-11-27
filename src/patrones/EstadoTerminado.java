/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones;

public class EstadoTerminado implements EstadoTarea {

    @Override
    public String getNombreEstado() {
        return "terminado";
    }

    @Override
    public EstadoTarea avanzarEstado() {
        return this;
    }
}