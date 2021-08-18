package dao;

import Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "account", path = "Account-id")
public interface AccountRepository extends JpaRepository<Account, Long> {
}
