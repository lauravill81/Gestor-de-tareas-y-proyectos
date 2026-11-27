/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ImportanciaPorFechaProxima implements EstrategiaImportancia {

    @Override
    public String calcularImportancia(Date fechaEntrega) {
        if (fechaEntrega == null) {
            return "Baja";
        }
        Date hoy = new Date();
        long diffMillis = fechaEntrega.getTime() - hoy.getTime();
        long dias = TimeUnit.MILLISECONDS.toDays(diffMillis);

        if (dias <= 2) {
            return "Alta";
        } else if (dias <= 5) {
            return "Media";
        } else {
            return "Baja";
        }
    }
}
