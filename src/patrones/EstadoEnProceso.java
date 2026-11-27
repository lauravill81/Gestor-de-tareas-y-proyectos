/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones;

public class EstadoEnProceso implements EstadoTarea {

    @Override
    public String getNombreEstado() {
        return "proceso";
    }

    @Override
    public EstadoTarea avanzarEstado() {
        return new EstadoTerminado();
    }
}