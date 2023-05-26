
package MODELO;
import java.sql.Timestamp;


public class pma_savedsearches extends Object {
    
private int pma_id;
private char user_name;
private char db_name;
private char search_name;
private String search_data;

    public pma_savedsearches(int pma_id, char user_name, char db_name, char search_name, String search_data) {
        this.pma_id = pma_id;
        this.user_name = user_name;
        this.db_name = db_name;
        this.search_name = search_name;
        this.search_data = search_data;
    }

    public pma_savedsearches(int pma_id, char user_name, char db_name, char search_name, String search_data, int id) {
        super(id);
        this.pma_id = pma_id;
        this.user_name = user_name;
        this.db_name = db_name;
        this.search_name = search_name;
        this.search_data = search_data;
    }

    


    
    
    
    
    
}
