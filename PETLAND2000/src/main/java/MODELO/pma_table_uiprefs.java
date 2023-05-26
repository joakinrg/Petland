
package MODELO;
import java.sql.Timestamp;

public class pma_table_uiprefs  extends Object {
    
 private char user_name;
 private char db_name;
 private char table_name;
 private String prefs;
 private Timestamp last_update;

    public pma_table_uiprefs(char user_name, char db_name, char table_name, String prefs, Timestamp last_update) {
        this.user_name = user_name;
        this.db_name = db_name;
        this.table_name = table_name;
        this.prefs = prefs;
        this.last_update = last_update;
    }

    public pma_table_uiprefs(char user_name, char db_name, char table_name, String prefs, Timestamp last_update, int id) {
        super(id);
        this.user_name = user_name;
        this.db_name = db_name;
        this.table_name = table_name;
        this.prefs = prefs;
        this.last_update = last_update;
    }
    
    
}
