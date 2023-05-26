
package MODELO;
import java.sql.Timestamp;

public class pma_table_info  extends Object{
 private char user_name;
 private String settings_data;

    public pma_table_info(char user_name, String settings_data) {
        this.user_name = user_name;
        this.settings_data = settings_data;
    }

    public pma_table_info(char user_name, String settings_data, int id) {
        super(id);
        this.user_name = user_name;
        this.settings_data = settings_data;
    }

    
    
}
