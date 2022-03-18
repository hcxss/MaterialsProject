package com.bistu.materialsproject.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(collection = "dos")
//@Data // 生成 toString 和 getter && setter
//@NoArgsConstructor //生成无参构造方法
//@AllArgsConstructor//生成全部有参构造方法
public class Dos {
    public int getMp_id() {
        return mp_id;
    }

    public void setMp_id(int mp_id) {
        this.mp_id = mp_id;
    }

    public double getEfermi() {
        return efermi;
    }

    public void setEfermi(double efermi) {
        this.efermi = efermi;
    }

    public String getSpin_polarization() {
        return spin_polarization;
    }

    public void setSpin_polarization(String spin_polarization) {
        this.spin_polarization = spin_polarization;
    }

    private int mp_id;
    private double efermi;
    private String spin_polarization;

}
