package com.kc.UserAuthentication.data.repository;

import com.kc.UserAuthentication.data.model.AppUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class AppAppUserRepositoryTest {
    @Autowired
    AppUserRepository appUserRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findByUsername() {
    }

    @Test
    void save() {
        AppUser appUser = new AppUser();
        appUser.setFirstName("adewale");
        appUser.setLastName("shipe");
        appUser.setEmail("ade@gmail.com");
        appUser.setPassword("123456");
        appUser.setUsername("ade");
                appUserRepository.save(appUser);
                log.info(" saving my user ->{}", appUser);



    }
}