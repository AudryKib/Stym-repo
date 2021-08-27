package org.ItSolutions.StymBackEnd.dao;

import org.ItSolutions.StymBackEnd.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestResource(collectionResourceRel = "userId", path = "userid")
public interface UserRepository extends JpaRepository<User,Integer> {

}
