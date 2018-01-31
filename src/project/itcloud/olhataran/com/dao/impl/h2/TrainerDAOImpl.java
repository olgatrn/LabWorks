package project.itcloud.olhataran.com.dao.impl.h2;

import project.itcloud.olhataran.com.dao.TrainerDAO;
import project.itcloud.olhataran.com.model.Trainer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TrainerDAOImpl extends DatabaseConnector implements TrainerDAO {

    public TrainerDAOImpl() throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
    }

    @Override
    public boolean addTrainer(Trainer trainer) {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(INSERT_TRAINER);
            ps.setInt(1, trainer.getId());
            ps.setString(2, trainer.getFirstName());
            ps.setString(3, trainer.getLastName());
            return ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Trainer getTrainerById(int id) {
        Trainer trainer = null;
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(SELECT_TRAINER_BY_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                trainer = new Trainer.TrainerBuilder(rs.getString("first_name"),
                        rs.getString("last_name")).build();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        // TODO
        // addition of the list of courses

        return trainer;
    }
}
