
package com.mycompany.login.logica;

import com.mycompany.login.igu.Bienvenida;
import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis;
    Bienvenida pantalla2 = new Bienvenida();
    public Controladora() {
        controlPersis = new ControladoraPersistencia();
    }

    public String validarUsuario(String usuario, String contrasenia) {
        String mensaje="";
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        for (Usuario usu : listaUsuarios){
            if (usu.getNombreUsuario().equals(usuario)){
                if(usu.getContrasenia().equals(contrasenia)){
                    mensaje = "Usuario y contraseña correcta. Bienvenido/a";
                    pantalla2.setVisible(true);
                    pantalla2.setLocationRelativeTo(null);
                    return mensaje;
                    
                    
                    
                    
                }
                else {
                    mensaje= "Contraseña incorrecta";
                    return mensaje;
                }
            }
            else {
                mensaje= "Usuario no encontrado";
                
            }
        }
        return mensaje;
    }
    
}
