package co.edu.unquindio.poo.controller;

import co.edu.unquindio.poo.application.App;
import co.edu.unquindio.poo.model.Empresa;;

public class LoginController {

    Empresa empresa;

    public LoginController(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean iniciarSesion(String identificacion, String contrasenia) {
        return empresa.iniciarSesion(identificacion, contrasenia);  
    }

    
    public void setApp(App app) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setApp'");
    }
}
