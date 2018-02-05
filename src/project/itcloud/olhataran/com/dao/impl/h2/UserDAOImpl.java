package project.itcloud.olhataran.com.dao.impl.h2;

import project.itcloud.olhataran.com.dao.UserDAO;
import project.itcloud.olhataran.com.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAOImpl extends DatabaseConnector implements UserDAO {
    @Override
    public boolean add(User user) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(INSERT_USER)) {
            ps.setString(1, user.getLogin());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.isAdmin() ? 1 : 0);
            return ps.execute();
        }
    }
}
