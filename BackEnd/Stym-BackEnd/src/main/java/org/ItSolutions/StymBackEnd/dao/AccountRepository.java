package org.ItSolutions.StymBackEnd.dao;

import org.ItSolutions.StymBackEnd.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "account", path = "accounts")
public interface AccountRepository extends JpaRepository<Account, Integer> {

    /**
     * JPQL query to retrieve Stems and MP3s from Account id
     * @param - AccountId
     */

    Library findLibraryByuserName (String userName);

}
