package com.fon.parfemi.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fon.parfemi.domain.Grad;

import java.util.List;

@Repository
public interface GradRepository extends CrudRepository<Grad, Long>{

    @Query("select g from Grad g where g.nazivGrada like %:param%")
    List<Grad> findGradByNameLike(@Param("param") String param);

}

