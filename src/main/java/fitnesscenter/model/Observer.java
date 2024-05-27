package fitnesscenter.model;

import fitnesscenter.trainingprogram.TrainingProgram;

public interface Observer {

  void update(TrainingProgram trainingProgram);
}
