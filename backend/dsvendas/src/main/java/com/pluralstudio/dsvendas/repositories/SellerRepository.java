package com.pluralstudio.dsvendas.repositories;

import com.pluralstudio.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository  extends JpaRepository<Seller,Long> {
}
