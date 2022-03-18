package com.bistu.materialsproject.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(collection = "composition")
//@Data // 生成 toString 和 getter && setter
//@NoArgsConstructor //生成无参构造方法
//@AllArgsConstructor//生成全部有参构造方法
public class Composition {

  public int getMp_id() {
    return mp_id;
  }

  public void setMp_id(int mp_id) {
    this.mp_id = mp_id;
  }

  public String getHill_formula() {
    return hill_formula;
  }

  public void setHill_formula(String hill_formula) {
    this.hill_formula = hill_formula;
  }

  public String getIupac_formula() {
    return iupac_formula;
  }

  public void setIupac_formula(String iupac_formula) {
    this.iupac_formula = iupac_formula;
  }

  public String getFormula() {
    return formula;
  }

  public void setFormula(String formula) {
    this.formula = formula;
  }

  public double getAverage_electroneg() {
    return average_electroneg;
  }

  public void setAverage_electroneg(double average_electroneg) {
    this.average_electroneg = average_electroneg;
  }

  public String getChemical_system() {
    return chemical_system;
  }

  public void setChemical_system(String chemical_system) {
    this.chemical_system = chemical_system;
  }

  public double getNum_atoms() {
    return num_atoms;
  }

  public void setNum_atoms(double num_atoms) {
    this.num_atoms = num_atoms;
  }

  public String getOxi_prob() {
    return oxi_prob;
  }

  public void setOxi_prob(String oxi_prob) {
    this.oxi_prob = oxi_prob;
  }

  public double getTotal_electrons() {
    return total_electrons;
  }

  public void setTotal_electrons(double total_electrons) {
    this.total_electrons = total_electrons;
  }

  public boolean isValid() {
    return valid;
  }

  public void setValid(boolean valid) {
    this.valid = valid;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getSTRING_MODE() {
    return STRING_MODE;
  }

  public void setSTRING_MODE(String STRING_MODE) {
    this.STRING_MODE = STRING_MODE;
  }

  public boolean isIs_element() {
    return is_element;
  }

  public void setIs_element(boolean is_element) {
    this.is_element = is_element;
  }

  public String getReduced_formula() {
    return reduced_formula;
  }

  public void setReduced_formula(String reduced_formula) {
    this.reduced_formula = reduced_formula;
  }

  public boolean isAllow_negative() {
    return allow_negative;
  }

  public void setAllow_negative(boolean allow_negative) {
    this.allow_negative = allow_negative;
  }

  public String getAlphabetical_formula() {
    return alphabetical_formula;
  }

  public void setAlphabetical_formula(String alphabetical_formula) {
    this.alphabetical_formula = alphabetical_formula;
  }

  public double getAmount_tolerance() {
    return amount_tolerance;
  }

  public void setAmount_tolerance(double amount_tolerance) {
    this.amount_tolerance = amount_tolerance;
  }

  public String getAnonymized_formula() {
    return anonymized_formula;
  }

  public void setAnonymized_formula(String anonymized_formula) {
    this.anonymized_formula = anonymized_formula;
  }

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
