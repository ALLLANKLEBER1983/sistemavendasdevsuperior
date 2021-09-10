package com.pluralstudio.dsvendas.repositories;

import com.pluralstudio.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale,Long> {
}
