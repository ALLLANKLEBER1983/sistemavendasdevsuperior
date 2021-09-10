package com.pluralstudio.dsvendas.services;

import com.pluralstudio.dsvendas.dto.SellerDTO;
import com.pluralstudio.dsvendas.entities.Seller;
import com.pluralstudio.dsvendas.repositories.SellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SellerService {

    private SellerRepository repository;

    public List<SellerDTO> findAll(){
        List<Seller> result =repository.findAll();
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
