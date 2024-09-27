package com.service.user_service.user.service;


import com.service.user_service.user.dto.ShowUserReqDto;
import com.service.user_service.user.dto.ShowUserResDto;

import java.util.List;

public interface UserService {

    ShowUserResDto showUser(ShowUserReqDto build);

    List<ShowUserResDto> showAllUsers();
}
