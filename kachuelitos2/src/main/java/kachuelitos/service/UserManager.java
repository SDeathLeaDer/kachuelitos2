package kachuelitos.service;

import java.io.Serializable;
import java.util.List;

import kachuelitos.persistence.entity.User;

public interface UserManager extends Serializable {

    public List<User> getUsers();

}