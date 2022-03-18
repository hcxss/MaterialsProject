package com.bistu.materialsproject.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@EntityScan
@Document(collection = "structure")
//@Data // 生成 toString 和 getter && setter
//@NoArgsConstructor //生成无参构造方法
//@AllArgsConstructor//生成全部有参构造方法
public class Structure {


    //    //  private String id;
    private int mp_id;
    private String formula;
    private ArrayList<Integer> atomic_numbers;
    private ArrayList<ArrayList<Double> > cart_coords;
    private int charge;
    private double density;
    private ArrayList<ArrayList<Double> > distance_matrix;
    private ArrayList<ArrayList<Double> > frac_coords;
    private boolean is_ordered;
    private int ntypesp;
    private int num_sites;
    private Object site_properties;
    private String types_of_specie;
    private String Type_of_species;
    private double volume;

    public int getMp_id() {
        return mp_id;
    }

    public void setMp_id(int mp_id) {
        this.mp_id = mp_id;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public ArrayList<Integer> getAtomic_numbers() {
        return atomic_numbers;
    }

    public void setAtomic_numbers(ArrayList<Integer> atomic_numbers) {
        this.atomic_numbers = atomic_numbers;
    }

    public ArrayList<ArrayList<Double>> getCart_coords() {
        return cart_coords;
    }

    public void setCart_coords(ArrayList<ArrayList<Double>> cart_coords) {
        this.cart_coords = cart_coords;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public ArrayList<ArrayList<Double>> getDistance_matrix() {
        return distance_matrix;
    }

    public void setDistance_matrix(ArrayList<ArrayList<Double>> distance_matrix) {
        this.distance_matrix = distance_matrix;
    }

    public ArrayList<ArrayList<Double>> getFrac_coords() {
        return frac_coords;
    }

    public void setFrac_coords(ArrayList<ArrayList<Double>> frac_coords) {
        this.frac_coords = frac_coords;
    }

    public boolean isIs_ordered() {
        return is_ordered;
    }

    public void setIs_ordered(boolean is_ordered) {
        this.is_ordered = is_ordered;
    }

    public int getNtypesp() {
        return ntypesp;
    }

    public void setNtypesp(int ntypesp) {
        this.ntypesp = ntypesp;
    }

    public int getNum_sites() {
        return num_sites;
    }

    public void setNum_sites(int num_sites) {
        this.num_sites = num_sites;
    }

    public Object getSite_properties() {
        return site_properties;
    }

    public void setSite_properties(Object site_properties) {
        this.site_properties = site_properties;
    }

    public String getTypes_of_specie() {
        return types_of_specie;
    }

    public void setTypes_of_specie(String types_of_specie) {
        this.types_of_specie = types_of_specie;
    }

    public String getType_of_species() {
        return Type_of_species;
    }

    public void setType_of_species(String type_of_species) {
        Type_of_species = type_of_species;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
