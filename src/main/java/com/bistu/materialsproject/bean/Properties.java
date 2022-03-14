package com.bistu.materialsproject.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(collection = "composition")
@Data // 生成 toString 和 getter && setter
@NoArgsConstructor //生成无参构造方法
@AllArgsConstructor//生成全部有参构造方法
public class Properties {
    //  private String id;
    private int material_id;
    private double energy;
    private double energy_per_atom;
    private double volume;
    private double formation_energy_per_atom;
    private int nsites;
    private String unit_cell_formula;
    private String pretty_formula;
    private boolean is_ois_hubbard;
    private boolean is_compatible;
    private int elements;
    private int nelements;
    private String spacegroup;
    private int task_id;
    private double band_gap;
    private double density;
    private boolean Icsd_id;
    private boolean Icsd_ids;
    private double total_magnetization;
    private String Oxide_type;
    private String tags;
    private String elasticity;

}
