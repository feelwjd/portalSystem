package portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import portal.dao.UserDAO;
import portal.model.User;
import portal.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
	UserDAO userDAO;

    @Override
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void addUser(User user) {
        userDAO.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
