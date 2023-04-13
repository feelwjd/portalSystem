package portal.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import portal.model.User;

@Component
public interface UserDAO {
    User getUserById(int id);
    List<User> getAllUsers();
    void insertUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}
