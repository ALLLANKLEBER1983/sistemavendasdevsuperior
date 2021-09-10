package com.pluralstudio.dsvendas.dto;

import com.pluralstudio.dsvendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaleSuccesDTO {
    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSuccesDTO(Seller seller, Long visited, Long deals) {
        sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }
}
