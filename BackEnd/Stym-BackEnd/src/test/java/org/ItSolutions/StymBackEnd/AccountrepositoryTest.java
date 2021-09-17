package org.ItSolutions.StymBackEnd;

import org.ItSolutions.StymBackEnd.Entity.Account;
import org.ItSolutions.StymBackEnd.Entity.Stem_Folder;
import org.ItSolutions.StymBackEnd.dao.AccountRepository;
import org.ItSolutions.StymBackEnd.dao.LibraryRepository;
import org.ItSolutions.StymBackEnd.dao.StemMP3Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class AccountrepositoryTest {

    @Autowired
    private LibraryRepository libraryRepository;
    @Autowired
    private StemMP3Repository stemMP3Repository;



    @Test
    public void printAllStems (){

//        List<Stem_Folder> stems = stemMP3Repository.findStemFolderByAccountId(1);
//        System.out.println(stems);

    }

    @Test
    public  void getStems(){
        List<Stem_Folder> stems = libraryRepository.getStemsByAccountIdSql(2);
        System.out.println(stems.toString());
          }
}
