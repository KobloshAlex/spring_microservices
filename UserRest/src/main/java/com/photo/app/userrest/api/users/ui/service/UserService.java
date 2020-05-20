package com.photo.app.userrest.api.users.ui.service;

import com.photo.app.userrest.api.users.ui.dto.UserDto;

public interface UserService {
    UserDto createUser (UserDto userDetails);
}
