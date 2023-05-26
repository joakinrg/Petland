
package MODELO;


public class pma_realtion extends Object {
    
private char master_db;
private char master_table;
private char master_field;
private char foreign_db;
private char foreign_table;
private char foreign_field;

    public pma_realtion(char master_db, char master_table, char master_field, char foreign_db, char foreign_table, char foreign_field) {
        this.master_db = master_db;
        this.master_table = master_table;
        this.master_field = master_field;
        this.foreign_db = foreign_db;
        this.foreign_table = foreign_table;
        this.foreign_field = foreign_field;
    }

    public pma_realtion(char master_db, char master_table, char master_field, char foreign_db, char foreign_table, char foreign_field, int id) {
        super(id);
        this.master_db = master_db;
        this.master_table = master_table;
        this.master_field = master_field;
        this.foreign_db = foreign_db;
        this.foreign_table = foreign_table;
        this.foreign_field = foreign_field;
    }

    
    
}
