package co.edu.unquindio.poo.controller;

import co.edu.unquindio.poo.model.Empresa;

public class OlvidasteLaContraseniaController {

    Empresa empresa;

    public OlvidasteLaContraseniaController(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean iniciarSesionPalabraClave(String palabraClave) {
        return empresa.iniciarSesionPalabraClave(palabraClave);
    }
    
}
