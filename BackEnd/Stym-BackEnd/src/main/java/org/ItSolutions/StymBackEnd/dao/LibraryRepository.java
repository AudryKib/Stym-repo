package org.ItSolutions.StymBackEnd.dao;

import org.ItSolutions.StymBackEnd.Entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Libraries", path = "libraries")
public interface LibraryRepository extends JpaRepository<Library,Integer> {
}
