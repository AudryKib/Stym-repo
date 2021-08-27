package org.ItSolutions.StymBackEnd.dao;

import org.ItSolutions.StymBackEnd.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Account", path = "account-id")
public interface AccountRepository extends JpaRepository<Account, Integer> {
}
