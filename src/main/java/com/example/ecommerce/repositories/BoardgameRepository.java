package com.example.ecommerce.repositories;

import com.example.ecommerce.entities.Boardgame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardgameRepository extends JpaRepository<Boardgame, Long> {

    List<Boardgame> findByScoreIsGreaterThan(float score);

    List<Boardgame> findByCategory_Id(Long id);

//    List<Boardgame> findBy();

}
