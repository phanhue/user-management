package usermanagement.demo.services;

import usermanagement.demo.dao.models.User;
import usermanagement.demo.dto.UserDTO;

public interface UserService {
    //String addUser(User user);
    void postUser(UserDTO userDTO);


}
