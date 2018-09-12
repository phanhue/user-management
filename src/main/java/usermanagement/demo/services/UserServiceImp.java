package usermanagement.demo.services;

import org.springframework.stereotype.Service;
import usermanagement.demo.dao.models.User;
import usermanagement.demo.dao.repositories.UserRepository;
import usermanagement.demo.dto.UserDTO;

@Service
public class UserServiceImp implements UserService{
private UserRepository userRepository;

public UserServiceImp(UserRepository userRepository){
    this.userRepository = userRepository;

}
    /*@Override
    public String addUser(User user) {
    userRepository.save(user);
        return "OK";
    }*/

    @Override
    public void postUser(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getFullname());
        user.setFullname(userDTO.getFullname());
        user.setPassword(userDTO.getPassword());
        userRepository.save(user);

    }
}
