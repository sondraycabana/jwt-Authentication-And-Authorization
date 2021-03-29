package com.kc.UserAuthentication.service.userService;

import com.kc.UserAuthentication.data.model.AppUser;

public interface UserService {
    AppUser saveUser(AppUser userDto);
}
