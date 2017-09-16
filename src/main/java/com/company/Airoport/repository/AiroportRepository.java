package com.company.Airoport.repository;

import com.company.Airoport.model.Airoport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AiroportRepository extends CrudRepository<Airoport, Integer> {

}
