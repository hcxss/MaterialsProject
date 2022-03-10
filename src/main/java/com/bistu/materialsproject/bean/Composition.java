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
public class Composition {

//  private String id;
  private int mp_id;
  private String hill_formula;
  private String iupac_formula;
  private String formula;
  private double average_electroneg;
  private String chemical_system;
  private double num_atoms;
  private String oxi_prob;
  private double total_electrons;
  private boolean valid;
  private double weight;
  private String STRING_MODE;
  private boolean is_element;
  private String reduced_formula;
  private boolean allow_negative;
  private String alphabetical_formula;
  private double amount_tolerance;
  private String anonymized_formula;
}
