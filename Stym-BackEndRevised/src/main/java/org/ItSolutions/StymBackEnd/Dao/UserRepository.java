package org.ItSolutions.StymBackEnd.Dao;

import org.ItSolutions.StymBackEnd.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
