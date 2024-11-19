package co.edu.unquindio.poo.controller;

import java.util.Observable;

import co.edu.unquindio.poo.model.Compra;
import co.edu.unquindio.poo.model.Empresa;
import co.edu.unquindio.poo.model.Venta;
import javafx.collections.ObservableList;

public class VerReportesController {

    Empresa empresa;

    public VerReportesController(Empresa empresa) {
        this.empresa = empresa;
    }

    public ObservableList<Venta> generarReporteVentasEmpleado(String IdEmpleado) {
        return empresa.generarReporteVentasEmpleado(IdEmpleado);
        
    }

    public ObservableList<Compra> generarReporteComprasEmpleado(String IdEmpleado) {
        return empresa.generarReporteComprasEmpleado(IdEmpleado);
    }

}
