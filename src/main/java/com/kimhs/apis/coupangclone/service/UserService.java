package com.kimhs.apis.coupangclone.service;

import com.kimhs.apis.coupangclone.datamodel.dto.UserDTO;
import com.kimhs.apis.coupangclone.datamodel.vo.UserLoginCheckVO;
import com.kimhs.apis.coupangclone.exception.ControllableException;
import com.kimhs.apis.coupangclone.model.User;
import com.kimhs.apis.coupangclone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTO> getUsers() {
        return this.userRepository.findAll().stream()
                .map(UserDTO::new)
                .collect(Collectors.toList());
    }

    public UserDTO getUserById(int userId) throws ControllableException {
        Optional<User> searchedUser = this.userRepository.findById(userId);
        return new UserDTO(searchedUser.orElseThrow(() -> new ControllableException("해당 유저를 찾지 못하였습니다.")));
    }

    public UserDTO getUserByEmail(String userEmail) throws ControllableException {
        Optional<User> searchedUser = Optional.ofNullable(this.userRepository.findByEmail(userEmail));
        return new UserDTO(searchedUser.orElseThrow(() -> new ControllableException("해당 유저를 찾지 못하였습니다.")));
    }

    public Boolean checkLoginInvalid(UserLoginCheckVO userLoginCheckVO) {
        return false;
    }
}
