package MODELO;

import java.sql.Timestamp;

public class Usuario extends Object {
    
   private long per_img;
   private int usu_id;
   private int  log_id;
   private char usu_RFC;
   private char usu_nombre;
   private char usu_apapt;
   private int usu_admin; 

    public Usuario(long per_img, int usu_id, int log_id, char usu_RFC, char usu_nombre, char usu_apapt, int usu_admin) {
        this.per_img = per_img;
        this.usu_id = usu_id;
        this.log_id = log_id;
        this.usu_RFC = usu_RFC;
        this.usu_nombre = usu_nombre;
        this.usu_apapt = usu_apapt;
        this.usu_admin = usu_admin;
    }

    public Usuario(long per_img, int usu_id, int log_id, char usu_RFC, char usu_nombre, char usu_apapt, int usu_admin, int id) {
        super(id);
        this.per_img = per_img;
        this.usu_id = usu_id;
        this.log_id = log_id;
        this.usu_RFC = usu_RFC;
        this.usu_nombre = usu_nombre;
        this.usu_apapt = usu_apapt;
        this.usu_admin = usu_admin;
    }
  

}