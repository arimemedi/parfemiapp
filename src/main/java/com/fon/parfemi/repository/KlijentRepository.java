package com.fon.parfemi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fon.parfemi.domain.Klijent;

@Repository
public interface KlijentRepository extends CrudRepository<Klijent, Long> {

}
