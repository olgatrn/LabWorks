package project.itcloud.olhataran.com.dao;

import project.itcloud.olhataran.com.model.User;

import java.sql.SQLException;

public interface UserDAO {
    boolean add(User user) throws SQLException;

//    boolean remove(User user);
}
