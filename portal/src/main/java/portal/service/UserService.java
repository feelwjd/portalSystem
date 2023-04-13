package portal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import portal.model.User;

@Service
public interface UserService {
    User getUserById(int id);
    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}
