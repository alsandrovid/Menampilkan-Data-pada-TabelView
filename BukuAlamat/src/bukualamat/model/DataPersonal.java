/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author USER
 */
public class DataPersonal {

    private  StringProperty NamaDepan = new SimpleStringProperty();
    private  StringProperty Namabelakang = new SimpleStringProperty();
    private  StringProperty Alamat = new SimpleStringProperty();
    private  StringProperty KotaKabupaten = new SimpleStringProperty();
    private  StringProperty NoHp = new SimpleStringProperty();

    public DataPersonal() {
    }
    
    public DataPersonal(String NamaDepan, String Namabelakang){
    this.NamaDepan = new SimpleStringProperty(NamaDepan);
    this.Namabelakang = new SimpleStringProperty(Namabelakang);
    
    this.Alamat = new SimpleStringProperty("suatu alamat");
    this.KotaKabupaten = new SimpleStringProperty("suatu kota");
    this.NoHp = new SimpleStringProperty("087792754198");
    }


    public String getNoHp() {
        return NoHp.get();
    }

    public void setNoHp(String value) {
        NoHp.set(value);
    }

    public StringProperty NoHpProperty() {
        return NoHp;
    }
    

    public String getKotaKabupaten() {
        return KotaKabupaten.get();
    }

    public void setKotaKabupaten(String value) {
        KotaKabupaten.set(value);
    }

    public StringProperty KotaKabupatenProperty() {
        return KotaKabupaten;
    }
    

    public String getAlamat() {
        return Alamat.get();
    }

    public void setAlamat(String value) {
        Alamat.set(value);
    }

    public StringProperty AlamatProperty() {
        return Alamat;
    }
    

    public String getNamabelakang() {
        return Namabelakang.get();
    }

    public void setNamabelakang(String value) {
        Namabelakang.set(value);
    }

    public StringProperty NamabelakangProperty() {
        return Namabelakang;
    }
    

    public String getNamaDepan() {
        return NamaDepan.get();
    }

    public void setNamaDepan(String value) {
        NamaDepan.set(value);
    }

    public StringProperty NamaDepanProperty() {
        return NamaDepan;
    }
    
    
}
