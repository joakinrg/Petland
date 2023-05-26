package MODELO;

public class pma_table_coords extends Object {
    
 private char db_name;
 private char table_name;
 private int pdf_page_number;
 private float x;
 private float y; 

    public pma_table_coords(char db_name, char table_name, int pdf_page_number, float x, float y) {
        this.db_name = db_name;
        this.table_name = table_name;
        this.pdf_page_number = pdf_page_number;
        this.x = x;
        this.y = y;
    }

    public pma_table_coords(char db_name, char table_name, int pdf_page_number, float x, float y, int id) {
        super(id);
        this.db_name = db_name;
        this.table_name = table_name;
        this.pdf_page_number = pdf_page_number;
        this.x = x;
        this.y = y;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
