package pojos;
// Generated 25-Oct-2018 16:55:56 by Hibernate Tools 4.3.1



/**
 * Dokter generated by hbm2java
 */
public class Dokter  implements java.io.Serializable {


     private Integer id;
     private String nama;
     private String spesialis;

    public Dokter() {
    }

    public Dokter(String nama, String spesialis) {
       this.nama = nama;
       this.spesialis = spesialis;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getSpesialis() {
        return this.spesialis;
    }
    
    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }




}


