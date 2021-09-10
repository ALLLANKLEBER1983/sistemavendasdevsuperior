package com.pluralstudio.dsvendas.repositories;

import com.pluralstudio.dsvendas.dto.SaleSuccesDTO;
import com.pluralstudio.dsvendas.dto.SaleSumDTO;
import com.pluralstudio.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale,Long> {

    @Query("SELECT new com.pluralstudio.dsvendas.dto.SaleSumDTO(obj.seller,SUM(obj.amount))" +
            " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.pluralstudio.dsvendas.dto.SaleSuccesDTO(obj.seller,SUM(obj.visited),SUM(obj.deals))" +
            " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccesDTO> succesGroupedBySeller();


}
