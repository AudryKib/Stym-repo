package org.ItSolutions.StymBackEnd.Dao;

import org.ItSolutions.StymBackEnd.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


public interface UserRepository extends JpaRepository<User, Long> {

}
