
package MODELO;
import java.sql.Timestamp;
public class pma_designer_settings extends Object {
    
private  char  username;
private String settings_data;

    public pma_designer_settings(char username, String settings_data) {
        this.username = username;
        this.settings_data = settings_data;
    }

    public pma_designer_settings(char username, String settings_data, int id) {
        super(id);
        this.username = username;
        this.settings_data = settings_data;
    }

     
}
