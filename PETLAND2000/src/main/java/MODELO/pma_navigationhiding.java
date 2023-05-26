
package MODELO;

import java.sql.Timestamp;

public class pma_navigationhiding extends Object{
    
private char user_name;
private char item_name;
private char item_type;
private char db_name;
private char table_name;

    public pma_navigationhiding(char user_name, char item_name, char item_type, char db_name, char table_name) {
        this.user_name = user_name;
        this.item_name = item_name;
        this.item_type = item_type;
        this.db_name = db_name;
        this.table_name = table_name;
    }

    public pma_navigationhiding(char user_name, char item_name, char item_type, char db_name, char table_name, int id) {
        super(id);
        this.user_name = user_name;
        this.item_name = item_name;
        this.item_type = item_type;
        this.db_name = db_name;
        this.table_name = table_name;
    }
        


    
}
