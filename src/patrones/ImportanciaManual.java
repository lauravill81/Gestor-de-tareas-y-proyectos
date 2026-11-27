/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones;

import java.util.Date;

public class ImportanciaManual implements EstrategiaImportancia {
    private final String importanciaFija;

    public ImportanciaManual(String importanciaFija) {
        this.importanciaFija = importanciaFija;
    }

    @Override
    public String calcularImportancia(Date fechaEntrega) {
        return importanciaFija;
    }
}