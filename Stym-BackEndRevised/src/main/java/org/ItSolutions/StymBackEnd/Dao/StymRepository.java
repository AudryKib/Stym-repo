package org.ItSolutions.StymBackEnd.Dao;


import org.ItSolutions.StymBackEnd.Entity.Stem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface StymRepository extends JpaRepository<Stem, Long> {

}
