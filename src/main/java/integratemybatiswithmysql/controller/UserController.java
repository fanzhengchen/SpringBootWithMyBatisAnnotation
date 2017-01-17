package integratemybatiswithmysql.controller;

import integratemybatiswithmysql.domain.User;
import integratemybatiswithmysql.mapper.UserMapper;
import integratemybatiswithmysql.requestbody.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by mark on 17-1-18.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @RequestMapping(value = "/login",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Login login(@RequestBody  Login login) {
        System.out.println(login.getName() + " " + login.getId());
//        return login;
        return login;
    }
}
