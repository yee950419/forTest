package com.service.user_service.user.service;

import com.service.user_service.user.dto.ShowUserReqDto;
import com.service.user_service.user.dto.ShowUserResDto;
import com.service.user_service.user.exception.UserException;
import com.service.user_service.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Transactional
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Transactional(readOnly = true)
    @Override
    public ShowUserResDto showUser(ShowUserReqDto showUserReqDto) {

        ShowUserResDto result = userMapper.showUser(showUserReqDto);

        if(result == null) {
            throw new UserException("해당 유저가 존재하지 않습니다.");
        }

        return result;

        /*try {

            ShowUserResDto result = userMapper.showUser(showUserReqDto);

            if(result == null) {
                throw new UserException("해당 유저가 존재하지 않습니다.");
            }

            return result;

        } catch (Exception e) {

            throw new UserException(e.getMessage());
        }*/
    }
}
