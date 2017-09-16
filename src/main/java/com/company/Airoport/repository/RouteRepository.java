package com.company.Airoport.repository;

import com.company.Airoport.model.Route;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository extends CrudRepository<Route, Integer>{

    @Query("select r from Route r where r.srcAiroport.name=:airoportName") //select r.* from Route r join Airoport a on a.id = r.srcAiroport_id where a.name=:airoportName
    List<Route> findByAiroportName(String airoportName);
}
