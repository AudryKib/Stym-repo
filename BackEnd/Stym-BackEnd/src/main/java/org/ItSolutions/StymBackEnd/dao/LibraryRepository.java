package org.ItSolutions.StymBackEnd.dao;

import org.ItSolutions.StymBackEnd.Entity.Library;
import org.ItSolutions.StymBackEnd.Entity.Stem_Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "Libraries", path = "libraries")
public interface LibraryRepository extends JpaRepository<Library,Integer> {



    @Query( value = "select t.stem, t.c_date, t.description, t.tracks from \n" +
            "library l inner join \n" +
            "(select f.name as stem, f.creation_date as c_date , \n" +
            "f.description as description, f.numberof_tracks as tracks, s.library_id\n" +
            "from stem_mp3 as s \n" +
            "inner join stem_folder as f \n" +
            "on \ts.stem_id = f.stem_id) as t \n" +
            "on l.library_id = t.library_id\n" +
            "where accountid = :accountid",
    nativeQuery = true)
     List<Stem_Folder> getStemsByAccountIdSql(@Param("accountid") Integer accountid);

}
