/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones;

public class EstadoPorIniciar implements EstadoTarea {

    @Override
    public String getNombreEstado() {
        return "por iniciar";
    }

    @Override
    public EstadoTarea avanzarEstado() {
        return new EstadoEnProceso();
    }
}
