package ru.isaykin.application.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.isaykin.application.model.Spice;

import java.util.List;

@Repository
public interface SpiceRepository extends PagingAndSortingRepository<Spice, Long> {

    Spice findByName(String name);

//    @Query("Select * from spice")
//    List<Spice> findAll();


}

