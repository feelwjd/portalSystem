package portal.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import portal.dao.UserDAO;
import portal.model.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
    @Autowired
	SqlSession sqlSession;

    @Override
    public User getUserById(int id) {
        return sqlSession.selectOne("getUserById", id);
    }

    @Override
    public List<User> getAllUsers() {
        return sqlSession.selectList("getAllUsers");
    }

    @Override
    public void insertUser(User user) {
        sqlSession.insert("insertUser", user);
    }

    @Override
    public void updateUser(User user) {
        sqlSession.update("updateUser", user);
    }

    @Override
    public void deleteUser(int id) {
        sqlSession.delete("deleteUser", id);
    }
}
