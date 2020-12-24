package com.kimhs.apis.coupangclone.route;

import com.kimhs.apis.coupangclone.datamodel.dto.UserDTO;
import com.kimhs.apis.coupangclone.datamodel.vo.UserLoginCheckVO;
import com.kimhs.apis.coupangclone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRoute {
    private final UserService userService;

    @Autowired
    public UserRoute(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    @ResponseBody
    public List<UserDTO> getUsers() {
        return null;
    }

    @GetMapping("/id/{user_id}")
    @ResponseBody
    public UserDTO getUserById(@PathVariable(value = "user_id") String userId) {
        return null;
    }

    @GetMapping("/email/{user_email}")
    @ResponseBody
    public UserDTO getUserByEmail(@PathVariable(value = "user_email") String userEmail) {
        return null;
    }

    @PostMapping("/login")
    public Boolean checkLoginInvalid(UserLoginCheckVO userLoginCheckVO) {
        return null;
    }

    @PostMapping("/registry")
    public void registryUser() {
    }

    @DeleteMapping("/{user_id}")
    public void deleteUser(@PathVariable(value = "user_id") String userId) {
    }

    @GetMapping("/initialize")
    public void initializeUsers() {
    }
}
