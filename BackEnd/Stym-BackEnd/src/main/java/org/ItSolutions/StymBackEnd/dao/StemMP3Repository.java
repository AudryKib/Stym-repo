package org.ItSolutions.StymBackEnd.dao;

import org.ItSolutions.StymBackEnd.Entity.Stem_Folder;
import org.ItSolutions.StymBackEnd.Entity.Stem_MP3;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface StemMP3Repository extends JpaRepository<Stem_MP3, Integer> {


}
