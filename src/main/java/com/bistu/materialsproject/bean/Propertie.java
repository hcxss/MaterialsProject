package com.bistu.materialsproject.bean;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.reflect.Array;
import java.util.ArrayList;

@EntityScan
@Document(collection = "properties")
//@Data // 生成 toString 和 getter && setter
//@NoArgsConstructor //生成无参构造方法
//@AllArgsConstructor//生成全部有参构造方法
public class Propertie {
    private int mp_id;

    public String getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(String material_id) {
        this.material_id = material_id;
    }

    private String material_id;
    private String pretty_formula;
    private Object unit_cell_formula;
    private double energy;
    private double energy_per_atom;
    private double volume;
    private double formation_energy_per_atom;
    private int nsites;
    private boolean is_ois_hubbard;

    public int getMp_id() {
        return mp_id;
    }

    public void setMp_id(int mp_id) {
        this.mp_id = mp_id;
    }

    public String getPretty_formula() {
        return pretty_formula;
    }

    public void setPretty_formula(String pretty_formula) {
        this.pretty_formula = pretty_formula;
    }

    public Object getUnit_cell_formula() {
        return unit_cell_formula;
    }

    public void setUnit_cell_formula(Object unit_cell_formula) {
        this.unit_cell_formula = unit_cell_formula;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getEnergy_per_atom() {
        return energy_per_atom;
    }

    public void setEnergy_per_atom(double energy_per_atom) {
        this.energy_per_atom = energy_per_atom;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getFormation_energy_per_atom() {
        return formation_energy_per_atom;
    }

    public void setFormation_energy_per_atom(double formation_energy_per_atom) {
        this.formation_energy_per_atom = formation_energy_per_atom;
    }

    public int getNsites() {
        return nsites;
    }

    public void setNsites(int nsites) {
        this.nsites = nsites;
    }

    public boolean isIs_ois_hubbard() {
        return is_ois_hubbard;
    }

    public void setIs_ois_hubbard(boolean is_ois_hubbard) {
        this.is_ois_hubbard = is_ois_hubbard;
    }

    public boolean isIs_compatible() {
        return is_compatible;
    }

    public void setIs_compatible(boolean is_compatible) {
        this.is_compatible = is_compatible;
    }

    public ArrayList<String> getElements() {
        return elements;
    }

    public void setElements(ArrayList<String> elements) {
        this.elements = elements;
    }

    public int getNelements() {
        return nelements;
    }

    public void setNelements(int nelements) {
        this.nelements = nelements;
    }

    public Object getSpacegroup() {
        return spacegroup;
    }

    public void setSpacegroup(Object spacegroup) {
        this.spacegroup = spacegroup;
    }

    public ArrayList<String> getTask_ids() {
        return task_ids;
    }

    public void setTask_ids(ArrayList<String> task_ids) {
        this.task_ids = task_ids;
    }

    public double getBand_gap() {
        return band_gap;
    }

    public void setBand_gap(double band_gap) {
        this.band_gap = band_gap;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public boolean isIcsd_id() {
        return Icsd_id;
    }

    public void setIcsd_id(boolean icsd_id) {
        Icsd_id = icsd_id;
    }

    public ArrayList<Integer> getIcsd_ids() {
        return Icsd_ids;
    }

    public void setIcsd_ids(ArrayList<Integer> icsd_ids) {
        Icsd_ids = icsd_ids;
    }

    public double getTotal_magnetization() {
        return total_magnetization;
    }

    public void setTotal_magnetization(double total_magnetization) {
        this.total_magnetization = total_magnetization;
    }

    public String getOxide_type() {
        return Oxide_type;
    }

    public void setOxide_type(String oxide_type) {
        Oxide_type = oxide_type;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public Object getElasticity() {
        return elasticity;
    }

    public void setElasticity(Object elasticity) {
        this.elasticity = elasticity;
    }

    private boolean is_compatible;
    private ArrayList<String > elements;
    private int nelements;
    private Object spacegroup;
    private ArrayList<String > task_ids;
    private double band_gap;
    private double density;
    private boolean Icsd_id;
    private ArrayList<Integer > Icsd_ids;
    private double total_magnetization;
    private String Oxide_type;
    private ArrayList<String > tags;
    private Object elasticity;


}
