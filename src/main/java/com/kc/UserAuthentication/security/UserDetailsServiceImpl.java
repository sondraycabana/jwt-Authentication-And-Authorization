package com.kc.UserAuthentication.security;

import com.kc.UserAuthentication.data.model.AppUser;
import com.kc.UserAuthentication.data.repository.AppUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {


    @Autowired
    AppUserRepository appUserRepository;


    public UserDetailsServiceImpl(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        AppUser appUser = appUserRepository.findByEmail(email);

        if (appUser == null){
            throw  new UsernameNotFoundException("");
        }

        return new User(appUser.getEmail(), appUser.getPassword(), Collections.emptyList());

    }
}
