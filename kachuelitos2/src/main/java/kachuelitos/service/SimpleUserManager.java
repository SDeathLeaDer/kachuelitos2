package kachuelitos.service;

import java.util.List;

import kachuelitos.persistence.dao.UserDao;
import kachuelitos.persistence.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleUserManager implements UserManager {

    private static final long serialVersionUID = 1L;

    @Autowired
    private UserDao  userDao;

    public void setProductDao(UserDao userDao) {
        this.userDao = userDao;
        
    }

    public List<User> getUsers() {
        return userDao.getAllUsuario();
    }

}