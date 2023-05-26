
package MODELO;
import java.sql.Timestamp;

public class login extends Object {
    
private int log_id; 
private char log_usuario;
private char log_clave;

    public login(int log_id, char log_usuario, char log_clave) {
        this.log_id = log_id;
        this.log_usuario = log_usuario;
        this.log_clave = log_clave;
    }

    public login(int log_id, char log_usuario, char log_clave, int id) {
        super(id);
        this.log_id = log_id;
        this.log_usuario = log_usuario;
        this.log_clave = log_clave;
    }


    
    
    
    
    
}
