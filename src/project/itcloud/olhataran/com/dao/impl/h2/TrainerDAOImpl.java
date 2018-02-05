package project.itcloud.olhataran.com.dao.impl.h2;

import project.itcloud.olhataran.com.dao.TrainerDAO;
import project.itcloud.olhataran.com.model.Trainer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TrainerDAOImpl extends DatabaseConnector implements TrainerDAO {

    public TrainerDAOImpl() throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
    }

    @Override
    public boolean add(Trainer trainer) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(INSERT_TRAINER)) {
            ps.setInt(1, trainer.getId());
            ps.setString(2, trainer.getFirstName());
            ps.setString(3, trainer.getLastName());
            return ps.execute();
        }
    }

    @Override
    public Trainer getById(int id) throws SQLException {
        Trainer trainer = null;
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(SELECT_TRAINER_BY_ID)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                trainer = new Trainer.TrainerBuilder(rs.getString("first_name"),
                        rs.getString("last_name")).build();
            }
        }
        // TODO
        // addition of the list of courses
        return trainer;
    }

    @Override
    public List<Trainer> getAll() throws SQLException {
        List<Trainer> trainers = new ArrayList();
        try (Connection connection = getConnection();
             Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(SELECT_ALL_TRAINERS)) {
            while (rs.next()) {
                Trainer trainer = new Trainer.TrainerBuilder(rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"))
                        .build();
                trainers.add(trainer);
            }
            return trainers;
        }
    }
}
