package fitnesscenter.trainingprogram;

import fitnesscenter.model.Exercise;
import java.util.List;

public interface TrainingProgram {

  String getDescription();

  List<Exercise> getExercises();
}