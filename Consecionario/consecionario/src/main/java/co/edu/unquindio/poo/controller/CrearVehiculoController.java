package co.edu.unquindio.poo.controller;

import co.edu.unquindio.poo.model.Empresa;
import co.edu.unquindio.poo.model.TipoDeVehiculo;
import co.edu.unquindio.poo.model.TipoTransmision;
import co.edu.unquindio.poo.model.Vehiculo;

public class CrearVehiculoController {

    Empresa empresa;

    public CrearVehiculoController(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean CrearVehiculo(Vehiculo vehiculo) {
        return empresa.crearVehiculo(vehiculo);
    }

    public boolean eliminarVehiculo(Vehiculo vehiculo) {
        return empresa.eliminarVehiculo(vehiculo);
    }

    public boolean actualizarVehiculo(TipoTransmision tipoTransmision, String marca, String nuevoOUsado, String modelo,
    String cambios, String velocidadMaxima, String cilindraje, String matricula, TipoDeVehiculo tipoDeVehiculo) {
        return empresa.actualizarVehiculo(tipoTransmision, marca, nuevoOUsado, modelo, cambios, velocidadMaxima, cilindraje, matricula, tipoDeVehiculo);
    }
    
}
