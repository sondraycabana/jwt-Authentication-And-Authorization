package com.kc.UserAuthentication.service.userService;

import com.kc.UserAuthentication.data.model.AppUser;
import com.kc.UserAuthentication.data.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
    UserService userService;
  @Autowired
  AppUserRepository appUserRepository;
  @Autowired
  private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public AppUser saveUser(AppUser userDto) {
        userDto.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
        return appUserRepository.save(userDto);
    }
}
