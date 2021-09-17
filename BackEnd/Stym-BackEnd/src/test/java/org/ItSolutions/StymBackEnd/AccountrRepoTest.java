package org.ItSolutions.StymBackEnd;

import org.ItSolutions.StymBackEnd.Entity.Library;
import org.ItSolutions.StymBackEnd.dao.AccountRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class AccountrRepoTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void getLibrarybyId(){
    Library libraryList = accountRepository.findLibraryByuserName("dfildery1");
    System.out.println(libraryList);
    }
}
