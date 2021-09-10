package com.pluralstudio.dsvendas.dto;

import com.pluralstudio.dsvendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaleSumDTO implements Serializable {

    private String sellerName;
    private Double sum;

    public SaleSumDTO(Seller seller,Double sum){
        sellerName=seller.getName();
        this.sum=sum;


    }
}
