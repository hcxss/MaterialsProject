package com.bistu.materialsproject.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(collection = "dos")
@Data // 生成 toString 和 getter && setter
@NoArgsConstructor //生成无参构造方法
@AllArgsConstructor//生成全部有参构造方法
public class Dos {
    private int mp_id;
    private double efermi;
    private boolean spin_polarization;

}
