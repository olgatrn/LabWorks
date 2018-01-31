package project.itcloud.olhataran.com.dao;

import project.itcloud.olhataran.com.model.Trainer;

public interface TrainerDAO {
    boolean addTrainer(Trainer trainer);

    Trainer getTrainerById(int id);
}
