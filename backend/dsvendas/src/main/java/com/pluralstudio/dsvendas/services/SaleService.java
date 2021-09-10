package com.pluralstudio.dsvendas.services;

import com.pluralstudio.dsvendas.dto.SaleDTO;
import com.pluralstudio.dsvendas.entities.Sale;
import com.pluralstudio.dsvendas.repositories.SaleRepository;
import com.pluralstudio.dsvendas.repositories.SellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@AllArgsConstructor
public class SaleService {

    private SaleRepository repository;

    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable page){
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(page);
        return result.map(x-> new SaleDTO(x));
    }


}
