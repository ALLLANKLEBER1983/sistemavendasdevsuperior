package com.pluralstudio.dsvendas.controller;

import com.pluralstudio.dsvendas.dto.SaleDTO;
import com.pluralstudio.dsvendas.services.SaleService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping(value = "/sales")
@AllArgsConstructor
public class SaleController {

    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable page){
        Page<SaleDTO> list = service.findAll(page);
        return ResponseEntity.ok(list);
    }
}
