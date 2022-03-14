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
public class Structure {
//    //  private String id;
    private int mp_id;
    private String formula;
    private int atomic_numbers;
    private String cart_coords;
    private double charge;
    private String density;
    private double distance_matrix;
    private String frac_coords;
    private boolean is_ordered;
    private boolean ntypesp;
    private double num_sites;
    private String site_properties;
    private String types_of_specie;
    private String Type_of_species;
    private double volume;

}
