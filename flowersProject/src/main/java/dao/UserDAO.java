package dao;

import entitiy.Users;

import java.util.HashSet;
import java.util.Set;

public class UserDAO extends AbstractDAO {
    private static UserDAO instance;

    private Set<Users> allUsers;

    private UserDAO() {
        allUsers = new HashSet<Users>();
    }

    public static UserDAO getInstance() {
        if (instance == null) {
            instance = new UserDAO();
        }
        return instance;
    }

}
