package project.itcloud.olhataran.com.dao;

import project.itcloud.olhataran.com.model.Trainer;

import java.sql.SQLException;
import java.util.List;

public interface TrainerDAO {
    boolean add(Trainer trainer) throws SQLException;

    //TODO
    //boolean deleteById(int id) throws SQLException;

    Trainer getById(int id) throws SQLException;

    List<Trainer> getAll() throws SQLException;

    //TODO
    //boolean updateById(int id) throws SQLException;
}
