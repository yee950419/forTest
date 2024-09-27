package com.service.user_service.user.mapper;

import com.service.user_service.user.dto.ShowUserReqDto;
import com.service.user_service.user.dto.ShowUserResDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    ShowUserResDto showUser(ShowUserReqDto showUserReqDto);

    List<ShowUserResDto> showAllUsers();
}
